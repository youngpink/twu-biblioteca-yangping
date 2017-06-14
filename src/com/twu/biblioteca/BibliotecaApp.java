package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {

        Tools tool = new Tools();
        Books book = new Books();
        Goods movie = new Movies();
        final Accounts amy = new Users("123-0001","123","8560001", "1@qq.com");
        final Accounts blue = new Users("123-0002","123","8560002", "1@qq.com");
        ArrayList<Accounts> accounts = new ArrayList<Accounts>(){{add(amy); add(blue);}};

        tool.sayWelcome();

        tool.mainMenu();
        int choose = tool.getChoose();
        while(choose !=7){
            switch(choose) {
                case 1:
                    System.out.println(book.list());
                    break;
                case 2:
                    if(tool.login(amy)){
                        System.out.println("welcome" + amy.getUsername() + "!");
                        System.out.println(tool.checkOut(book, amy.getUsername()));
                    }else{
                        System.out.println("login failed!");
                    }
                    break;
                case 3:
                    if(tool.login(amy)){
                        System.out.println("welcome" + amy.getUsername() + "!");
                        System.out.println(tool.checkIn((Books) book));
                    }else{
                        System.out.println("login failed!");
                    }
                    break;
                case 4:
                    System.out.println(movie.list());
                    break;
                case 5:
                    if(tool.login(amy)){
                        System.out.println("welcome" + amy.getUsername() + "!");
                        System.out.println(tool.checkOut(movie, amy.getUsername()));
                    }else{
                        System.out.println("login failed!");
                    }
                    break;
                case 6:
                    System.out.println(book.listCheckedout(accounts));
                    break;
            }
            tool.mainMenu();
            choose = tool.getChoose();
        }
        System.exit(0);
    }
}
