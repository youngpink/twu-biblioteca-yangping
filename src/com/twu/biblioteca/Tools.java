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
                "6：Quit\n" +
                "请输入1-6：");
    }

    static int getChoose(){
        String inputErrorAlert = "Select a valid option!";
        Scanner in = new Scanner(System.in);
        int choose = in.nextInt();
        while(choose < 1 || choose > 6){
            System.out.println(inputErrorAlert);
            choose = in.nextInt();
        }
        return choose;
    }

    static String checkOut(Goods good){
        System.out.println("please input the name:");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        return good.checkOut(name);
    }

    static String checkIn(Books book){
        System.out.println("please input book name:");
        Scanner in = new Scanner(System.in);
        String bookname = in.nextLine();

        System.out.println("please input book author:");
        String bookauthor = in.nextLine();

        System.out.println("please input book year:");
        String bookyear = in.nextLine();

        return book.returnBook(bookname, bookauthor, bookyear);
    }
}
