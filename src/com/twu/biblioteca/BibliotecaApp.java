package com.twu.biblioteca;

import com.twu.biblioteca.Tools;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        Tools tool = new Tools();
        Books book = new Books();

        tool.sayWelcome();
        tool.mainMenu();

        int choose = tool.getChoose();
        while(choose !=4){
            switch(choose) {
                case 1:
                    System.out.println(book.listBook());
                    break;
                case 2:
                    System.out.println(tool.checkOut(book));
                    break;
                case 3:
                    System.out.println(choose);
                    break;
            }
            choose = tool.getChoose();
        }
        System.exit(0);
    }
}
