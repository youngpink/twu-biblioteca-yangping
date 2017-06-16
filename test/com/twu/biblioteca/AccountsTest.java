package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/16.
 */
public class AccountsTest {

    Accounts amy = new Accounts("123-0001", "123456", "027-12345678", "amy@gmail.com");
    Accounts bob = new Accounts("123-0002", "123456", "027-12345678", "bob@gmail.com");
    Accounts cindy = new Accounts("123-0003", "123456", "027-12345678", "cindy@gmail.com");

    ArrayList<Accounts> accounts = new ArrayList<Accounts>(){{add(amy);add(bob);add(cindy);}};

    @Test
    public void testGetters(){
        assertEquals("123-0001", amy.getUsername());
        assertEquals("123456", amy.getPassword());
        assertEquals("027-12345678", amy.getPhoneNmber());
        assertEquals("amy@gmail.com", amy.getEmail());
    }

    @Test
    public void testUserInfomation(){
        assertEquals("123-0001\t027-12345678\tamy@gmail.com\n", amy.userInfomation());
    }

    @Test
    public void testLogin(){
        assertEquals(true, Accounts.login(accounts, "123-0001", "123456"));
    }

    @Test
    public void testLoginWithNotExistUsername(){
        assertEquals(false, Accounts.login(accounts, "123-0006", "123456"));
    }

    @Test
    public void testLoginWithFalsePassword(){
        assertEquals(false, Accounts.login(accounts, "123-0001", "123"));
    }

    @Test
    public void testFindAccountByUsernameWithTrueUsername(){
        assertEquals(amy, Accounts.findAccountByUsername(accounts, "123-0001"));
    }

    @Test
    public void testFindAccountByUsernameWithFalseUsername(){
        assertEquals(null, Accounts.findAccountByUsername(accounts, "123"));
    }

    @Test
    public void testFindNumberWithTrueUsername(){
        assertEquals("027-12345678", Accounts.findNumber(accounts, "123-0001"));
    }

    @Test
    public void testFindNumberWithFalseUsername(){
        assertEquals("", Accounts.findNumber(accounts, "123"));
    }

    @Test
    public void testLoginIndevialWithTruePassword(){
        assertEquals(true, amy.login("123456"));
    }

    @Test
    public void testLoginIndeviallWithFalsePassword(){
        assertEquals(false, amy.login("123"));
    }
}
