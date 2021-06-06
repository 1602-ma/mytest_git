/*
package com.itheima.test;

import com.itheima.bean.Account;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

*/
/**
 * @author f
 * @date 2021/5/29 19:42
 *//*

public class TestAccountServiceImpl {
    @Test
   public void teatAdd() throws SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService as = (AccountService)context.getBean("as");
        Account a = new Account();
        a.setName("欧家");
        a.setMoney(888);
        int rows = as.add(a);
        System.out.println(rows);
    }

    @Test
    public void testDelete() throws SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        AccountService as = (AccountService)context.getBean("as");

        int rows = as.delete(7);
        System.out.println(rows);
    }

    @Test
    public void testUpdate() throws SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService as = (AccountService)context.getBean("as");
        Account a = as.findById(8);
        a.setMoney(999);
        int rows = as.update(a);
        System.out.println(rows);
    }

    @Test
    public void testFindAll() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-all.xml");

    }
}
*/
