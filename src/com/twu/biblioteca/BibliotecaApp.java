package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        Tools tool = new Tools();
        Goods book = new Books();
        Goods movie = new Movies();
        Accounts amy = new Users("123-1234","123","8560123");

        tool.sayWelcome();

        tool.mainMenu();
        int choose = tool.getChoose();
        while(choose !=6){
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
                    System.out.println(tool.checkIn((Books) book));
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
            }
            tool.mainMenu();
            choose = tool.getChoose();
        }
        System.exit(0);
    }
}
