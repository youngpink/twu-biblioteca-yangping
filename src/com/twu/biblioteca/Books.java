package com.twu.biblioteca;

import java.util.ArrayList;
/**
 * Created by Administrator on 2017/6/10.
 */

public class Books {

    static ArrayList<String> booksName = new ArrayList<String>();
    static ArrayList<String> booksAuthre = new ArrayList<String>();
    static ArrayList<String> booksYear = new ArrayList<String>();

    public Books() {
        booksName.add("语文");
        booksName.add("数学");
        booksName.add("英语");
        booksName.add("物理");

        booksAuthre.add("张三");
        booksAuthre.add("李四");
        booksAuthre.add("王五");
        booksAuthre.add("赵六");

        booksYear.add("1990");
        booksYear.add("1966");
        booksYear.add("1998");
        booksYear.add("2001");

    }

    static String listBook(){
        String listString = "";
        for (int i = 0; i < booksName.size(); i++) {
            listString += booksName.get(i) + "\t" + booksAuthre.get(i) + "\t" + booksYear.get(i) + "\n";
        }

        return listString;
    }
}
