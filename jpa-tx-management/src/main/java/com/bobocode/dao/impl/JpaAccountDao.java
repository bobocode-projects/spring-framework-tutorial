package com.bobocode.dao.impl;

import com.bobocode.dao.AccountDao;
import com.bobocode.model.Account;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class JpaAccountDao implements AccountDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Account> findAll() {
        return entityManager.createQuery("select a from Account a", Account.class).getResultList();
    }

    @Override
    public Account findById(long id) {
        return entityManager.find(Account.class, id);
    }

    @Override
    public void save(Account account) {
        entityManager.persist(account);
    }
}
