# Spring MVC - JSP task

This web application should allow you to **create a new user** using a form by URL `/users/add`. 
It should handle POST request with new user data by URL `/users`. It should also handles GET requests to URL `/users`
 and **show a list of existing users**.
 
 All views are already implemented via JSP. User operations like `save()` and `findAll()` should be implemented in the
 `UserService` and that service should be injected into `UserController`
 
 Your job is to 
 * configure `ViewResolver` for JSP views
 * create and implement `UserService` that allows to store a new user and get al users 
 * implement `UserController` methods
 
 _Details are specified in the todo code comments_ 
 
 _See other Spring MVC examples here:_
 * https://github.com/BobocodeCourse/spring-framework/tree/master/spring-framework-mvc-basics
 * https://github.com/BobocodeCourse/spring-framework/tree/master/spring-framework-mvc-thymeleaf
 * https://github.com/BobocodeCourse/spring-framework/blob/master/spring-framework-rest-basics/src/main/java/com/bobocode/service/impl/UserServiceImpl.java