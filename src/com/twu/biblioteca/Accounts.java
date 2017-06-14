package com.twu.biblioteca;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Accounts {

    String username;
    String password;
    String phoneNmber;

    public Accounts(){}

    boolean login(String username, String password){
        return username.equals(this.username) && password.equals(this.password);
    }

    public String getUsername() {
        return username;
    }
}

