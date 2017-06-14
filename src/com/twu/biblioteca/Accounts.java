package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Accounts {

    String username;
    String password;
    String phoneNmber;
    String email;

    public Accounts(){}

    boolean login(String username, String password){
        return username.equals(this.username) && password.equals(this.password);
    }

    public String getUsername() {
        return username;
    }

    public String getPhoneNmber() {
        return phoneNmber;
    }

    public String getEmail() {
        return email;
    }

    static String findNumber(ArrayList<Accounts> accounts, String username){
        for(int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).getUsername().equals(username)){
                return accounts.get(i).getPhoneNmber();
            }
        }
        return "";
    }
}

