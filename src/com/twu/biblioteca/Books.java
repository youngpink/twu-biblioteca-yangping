package com.twu.biblioteca;

import java.util.ArrayList;
/**
 * Created by Administrator on 2017/6/10.
 */

public class Books extends Goods{

    public Books(String name, String author, String year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    static String list(ArrayList<Goods> books){
        String listString = "";
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getLendName().equals("")){
                listString += books.get(i).getName() + "\t" + books.get(i).getAuthor() + "\t" + books.get(i).getYear() + "\n";
            }
        }

        return listString;
    }

    static String listCheckedout(ArrayList<Goods> books, String phoneNumber){
        String listString = "";

        for (int i = 0; i < books.size(); i++) {
            if(!books.get(i).getLendName().equals("")){
                listString += books.get(i).getName() + "\t" + books.get(i).getLendName() + "\t" + phoneNumber + "\n";
            }
        }

        return listString;
    }
}
