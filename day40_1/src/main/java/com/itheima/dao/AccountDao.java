package com.itheima.dao;

import com.itheima.bean.Account;

import java.sql.SQLException;
import java.util.List;

/**
 * @author f
 * @date 2021/5/29 19:13
 */
public interface AccountDao {
    int add(Account account) throws SQLException;
    int delete(int id) throws SQLException;
    int update(Account account) throws SQLException;
    Account findById(int id) throws SQLException;
    List<Account> findAll() throws SQLException;
}
