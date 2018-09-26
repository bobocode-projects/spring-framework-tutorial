package com.bobocode.dao.impl;

import com.bobocode.dao.AccountDao;
import com.bobocode.model.Account;
import com.bobocode.util.TestDataGenerator;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * This class is marked with @{@link Component}, thus Spring container will create an instance of {@link FakeAccountDaoImpl}
 * class, and will register it the context.
 */
@Component
public class FakeAccountDaoImpl implements AccountDao {

    @Override
    public List<Account> getAllAccounts() {
        return TestDataGenerator.getAccountList(10);
    }
}
