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

    public Accounts(String username, String password, String phoneNmber, String email){
        this.username = username;
        this.password = password;
        this.phoneNmber = phoneNmber;
        this.email = email;
    }

    public String getUsername() {

        return this.username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNmber() {

        return this.phoneNmber;
    }

    public String getEmail() {
        return this.email;
    }

    String userInfomation(){
        return this.getUsername() + "\t" + this.getPhoneNmber() + "\t" + this.getEmail() + "\n";
    }

    boolean login(String password){
        return this.getPassword().equals(password);
    }

    static boolean login(ArrayList<Accounts> accounts, String username, String password){
        Accounts user = findAccountByUsername(accounts, username);
        return user != null ? user.getPassword().equals(password) : false;
    }

    static Accounts findAccountByUsername(ArrayList<Accounts> accounts, String username){
        for(int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).getUsername().equals(username)){
                return accounts.get(i);
            }
        }
        return null;
    }

    static String findNumber(ArrayList<Accounts> accounts, String username){
        Accounts user = findAccountByUsername(accounts, username);
        return user != null ?  user.getPhoneNmber() : "";
    }

    String checkOut(ArrayList<Goods> goods, String name){

        int index = Goods.findByName(goods, name);

        if(index != -1 && goods.get(index).getLendName().equals("")){
            goods.get(index).setLendName(this.username);
            return "Thank you! Enjoy the book";
        }

        return "That book is not available";
    }

    String returnGoods(ArrayList<Goods> goods, String name){

        int index = Goods.findByName(goods, name);

        if(index!=-1 && !goods.get(index).getLendName().equals("")){
            goods.get(index).setLendName("");
            return "Thank you for returning the book";

        }else{
            return "That is not a valid book to return";
        }
    }
}

