package com.bobocode.aspects;

import com.bobocode.model.User;
import com.bobocode.service.UserService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class UserServiceAspects {

    @Before("execution(com.bobocode.model.User com.bobocode.service.UserService.findByEmail(String)) && args(email)")
    public void beforeUserFindByEmail(String email) {
        System.out.println("*** Find user by email: " + email);
    }

    @Pointcut("execution(* com.bobocode.service.UserService.find*(..))")
    public void findFromUserService() {
    }

    @Before("findFromUserService()")
    public void beforeFind() {
        System.out.println("*** Find from UserService");
    }

    @After("findFromUserService() && target(service)")
    public void afterFindUser(JoinPoint joinPoint, UserService service) {
        String methodName = joinPoint.getSignature().getName();
        String className = service.getClass().getName();
        System.out.println("*** Got information using method " + methodName + " of class " + className);
    }

    @AfterReturning(value = "execution(* com.bobocode.service.UserService.findAllUsers(..))", returning = "users")
    public void afterReturningUserList(List<User> users) {
        System.out.println("*** Returned " + users.size() + " users");

    }

}
