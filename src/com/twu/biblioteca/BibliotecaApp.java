package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {

        ArrayList<Accounts> accounts = new ArrayList<Accounts>(){{
            add(new Accounts("123-0001", "123456", "027-12345678", "amy@gmail.com"));
            add(new Accounts("123-0002", "123456", "027-12345678", "bob@gmail.com"));
            add(new Accounts("123-0003", "123456", "027-12345678", "cindy@gmail.com"));
        }};

        ArrayList<Goods> books = new ArrayList<Goods>(){{
            add(new Books("chinese", "an", "1980"));
            add(new Books("math", "blue", "1990"));
            add(new Books("english", "may", "2010"));
        }};

        ArrayList<Goods> movies = new ArrayList<Goods>(){{
            add(new Movies("蝙蝠侠", "蒂姆", "1943", "9.5"));
            add(new Movies("蜘蛛侠", "斯瓦克汉默", "2002", "9.6"));
            add(new Movies("钢铁侠", "乔恩", "2008", ""));
        }};

        Tools.sayWelcome();
        Tools.mainMenu();

        int choose = Tools.getChoose();
        while(choose !=7){
            switch(choose) {
                case 1:
                    BibliotecaApp.list(books);
                    break;
                case 2:
                    BibliotecaApp.checkOut(accounts, books);
                    break;
                case 3:
                    BibliotecaApp.returnBook(accounts, books);
                    break;
                case 4:
                    BibliotecaApp.list(movies);
                    break;
                case 5:
                    BibliotecaApp.checkOut(accounts, movies);
                    break;
                case 6:
                    BibliotecaApp.listCheckedOut(accounts, books);
                    break;
            }
            Tools.mainMenu();
            choose = Tools.getChoose();
        }
        System.exit(0);
    }

    static void list(ArrayList<Goods> goods){
        if(goods.get(0) instanceof Movies) {
            ArrayList<Movies> movies = Tools.downward(goods);
            System.out.println(Movies.list(movies));
            return;
        }else{
            System.out.println(Books.list(goods));
        }
    }

    static void checkOut(ArrayList<Accounts> accounts, ArrayList<Goods> goods){
        Accounts user = Tools.login(accounts);
        if(user != null){
            System.out.println("welcome" + user.getUsername() + "!");
            System.out.println(Tools.checkOut(user, goods));
        }else{
            System.out.println("login failed!");
        }
    }

    static void returnBook(ArrayList<Accounts> accounts, ArrayList<Goods> goods){
        Accounts user = Tools.login(accounts);
        if(user != null){
            System.out.println("welcome" + user.getUsername() + "!");
            System.out.println(Tools.checkIn(user, goods));
        }else{
            System.out.println("login failed!");
        }
    }

    static void listCheckedOut(ArrayList<Accounts> accounts, ArrayList<Goods> goods){
        Accounts user = Tools.login(accounts);
        if(user != null){
            System.out.println("welcome" + user.getUsername() + "!");
            System.out.println(Books.listCheckedout(goods, user.getPhoneNmber()));
        }else{
            System.out.println("login failed!");
        }
    }
}
