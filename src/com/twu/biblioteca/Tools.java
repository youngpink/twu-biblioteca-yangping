package com.twu.biblioteca;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/10.
 */
public class Tools {

    static void sayWelcome(){
        System.out.println("Welcome to Biblioteca!");
    }

    static void mainMenu(){
        System.out.println("1：List Books\n" +
                "2：Check out a book\n" +
                "3：Return a book\n" +
                "4：Quit\n" +
                "请输入1-4：");
    }

    static int getChoose(){
        String inputErrorAlert = "Select a valid option!";
        Scanner in = new Scanner(System.in);
        int choose = in.nextInt();
        while(choose < 1 || choose > 4){
            System.out.println(inputErrorAlert);
            choose = in.nextInt();
        }
        return choose;
    }
}