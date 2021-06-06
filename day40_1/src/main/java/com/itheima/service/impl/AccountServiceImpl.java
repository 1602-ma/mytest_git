package com.itheima.service.impl;

import com.itheima.bean.Account;
import com.itheima.dao.AccountDao;
import com.itheima.service.AccountService;

import java.sql.SQLException;
import java.util.List;

/**
 * @author f
 * @date 2021/5/29 19:11
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public int add(Account account) throws SQLException {
        return accountDao.add(account);
    }

    @Override
    public int delete(int id) throws SQLException {
        return accountDao.delete(id);
    }

    @Override
    public int update(Account account) throws SQLException {
        return accountDao.update(account);
    }

    @Override
    public Account findById(int id) throws SQLException {
        return accountDao.findById(id);
    }

    @Override
    public List<Account> findAll() throws SQLException {
        return accountDao.findAll();
    }
}
