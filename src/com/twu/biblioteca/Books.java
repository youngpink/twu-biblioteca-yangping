package com.twu.biblioteca;

import java.util.ArrayList;
/**
 * Created by Administrator on 2017/6/10.
 */

public class Books {

    static ArrayList<String> booksName = new ArrayList<String>();
    static ArrayList<String> booksAuthor = new ArrayList<String>();
    static ArrayList<String> booksYear = new ArrayList<String>();

    public Books() {
        booksName.add("语文");
        booksName.add("数学");
        booksName.add("英语");
        booksName.add("物理");

        booksAuthor.add("张三");
        booksAuthor.add("李四");
        booksAuthor.add("王五");
        booksAuthor.add("赵六");

        booksYear.add("1990");
        booksYear.add("1966");
        booksYear.add("1998");
        booksYear.add("2001");

    }

    static String listBook(){
        String listString = "";
        for (int i = 0; i < booksName.size(); i++) {
            listString += booksName.get(i) + "\t" + booksAuthor.get(i) + "\t" + booksYear.get(i) + "\n";
        }

        return listString;
    }

    static boolean checkOutBook(String bookName){

        int index = booksName.indexOf(bookName);

        if(index == -1){
            return false;
        }

        booksName.remove(index);
        booksAuthor.remove(index);
        booksYear.remove(index);

        return true;
    }

    static boolean returnBook(String bookName, String bookAuthor,String bookYear){

        int index = booksName.indexOf(bookName);

        if(index != -1){
            return false;
        }

        booksName.add(bookName);
        booksAuthor.add(bookAuthor);
        booksYear.add(bookYear);

        return true;
    }
}
