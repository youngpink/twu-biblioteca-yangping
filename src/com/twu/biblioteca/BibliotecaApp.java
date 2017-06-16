package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {

        Books book = new Books();
        Movies movie = new Movies();

        final Accounts amy = new Accounts("123-0001", "123456", "027-12345678", "amy@gmail.com");
        final Accounts bob = new Accounts("123-0002", "123456", "027-12345678", "bob@gmail.com");
        final Accounts cindy = new Accounts("123-0003", "123456", "027-12345678", "cindy@gmail.com");

        ArrayList<Accounts> accounts = new ArrayList<Accounts>(){{add(amy);add(bob);add(cindy);}};

        Tools.sayWelcome();
        Tools.mainMenu();

        int choose = Tools.getChoose();
        while(choose !=7){
            switch(choose) {
                case 1:
                    BibliotecaApp.list(book);
                    break;
                case 2:
                    BibliotecaApp.checkOutBook(accounts, book);
                    break;
                case 3:
                    BibliotecaApp.returnBook(accounts, book);
                    break;
                case 4:
                    BibliotecaApp.list(movie);
                    break;
                case 5:
                    BibliotecaApp.checkOutBook(accounts, movie);
                    break;
                case 6:
                    System.out.println(book.listCheckedout(accounts));
                    break;
            }
            Tools.mainMenu();
            choose = Tools.getChoose();
        }
        System.exit(0);
    }

    static void list(Goods good){
        System.out.println(good.list());
    }

    static void checkOutBook(ArrayList<Accounts> accounts, Goods good){
        Accounts user = Tools.login(accounts);
        if(user != null){
            System.out.println("welcome" + user.getUsername() + "!");
            System.out.println(Tools.checkOut(good, user.getUsername()));
        }else{
            System.out.println("login failed!");
        }
    }

    static void returnBook(ArrayList<Accounts> accounts, Books book){
        Accounts user = Tools.login(accounts);
        if(user != null){
            System.out.println("welcome" + user.getUsername() + "!");
            System.out.println(Tools.checkIn(book));
        }else{
            System.out.println("login failed!");
        }
    }


}
