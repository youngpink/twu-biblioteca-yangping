package com.twu.biblioteca;

import java.util.Scanner;
import com.twu.biblioteca.Books;

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
                "4：List Movies\n" +
                "5：Check out a movie\n" +
                "6：List Checked out books\n" +
                "7：Quit\n" +
                "请输入1-7：");
    }

    static int getChoose(){
        String inputErrorAlert = "Select a valid option!";
        Scanner in = new Scanner(System.in);
        int choose = in.nextInt();
        while(choose < 1 || choose > 7){
            System.out.println(inputErrorAlert);
            choose = in.nextInt();
        }
        return choose;
    }

    static boolean login(Accounts user){
        System.out.println("please input your username:");
        Scanner in = new Scanner(System.in);
        String username = in.nextLine();
        System.out.println("please input your password:");
        String password = in.nextLine();
        return user.login(username, password);
    }

    static String checkOut(Goods good, String username){
        System.out.println("please input the name:");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        return good.checkOut(name, username);
    }

    static String checkIn(Books book){
        System.out.println("please input book name:");
        Scanner in = new Scanner(System.in);
        String bookname = in.nextLine();

        return book.returnBook(bookname);
    }
}
