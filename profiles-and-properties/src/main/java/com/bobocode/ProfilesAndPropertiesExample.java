package com.bobocode;

import com.bobocode.config.RootConfig;
import com.bobocode.model.Account;
import com.bobocode.util.TestDataGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class ProfilesAndPropertiesExample {
    private static EntityManagerFactory entityManagerFactory;

    public static void main(String[] args) {
        init();
        Account account = TestDataGenerator.getAccount();
        saveAccount(account);
        System.out.println(account);
    }

    private static void init() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RootConfig.class);
        entityManagerFactory = applicationContext.getBean(EntityManagerFactory.class);
    }

    private static void saveAccount(Account account) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        try {
            entityManager.persist(account);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        } finally {
            entityManager.close();
        }
    }
}
