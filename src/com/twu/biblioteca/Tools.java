package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;
import com.twu.biblioteca.Books;

/**
 * Created by Administrator on 2017/6/10.
 */
public class Tools {

    static int optionNumber = 7;

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
        while(choose < 1 || choose > optionNumber){
            System.out.println(inputErrorAlert);
            choose = in.nextInt();
        }
        return choose;
    }

    static Accounts login(ArrayList<Accounts> accounts){
        System.out.println("please input your username:");
        Scanner in = new Scanner(System.in);
        String username = in.nextLine();
        System.out.println("please input your password:");
        String password = in.nextLine();

        Accounts user = Accounts.findAccountByUsername(accounts, username);
        if(user != null && user.login(password)){
            System.out.println(user.userInfomation());
            return user;
        }
        return null;
    }

    static String checkOut(Accounts user, ArrayList<Goods> goods){
        System.out.println("please input the name:");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        return user.checkOut(goods, name);
    }

    static String checkIn(Accounts user, ArrayList<Goods> goods){
        System.out.println("please input book name:");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        return user.returnGoods(goods, name);
    }

    static ArrayList<Movies> downward(ArrayList<Goods> goods){
        ArrayList<Movies> movies = new ArrayList<Movies>();
        for(int i = 0; i < goods.size(); i++){
            movies.add((Movies)goods.get(i));
        }
        return movies;
    }
}
