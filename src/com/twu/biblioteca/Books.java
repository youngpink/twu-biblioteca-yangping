package com.twu.biblioteca;

import java.util.ArrayList;
/**
 * Created by Administrator on 2017/6/10.
 */

public class Books extends Goods{

    public Books() {
        this.name.add("语文");
        this.name.add("数学");
        this.name.add("英语");
        this.name.add("物理");

        this.author.add("张三");
        this.author.add("李四");
        this.author.add("王五");
        this.author.add("赵六");

        this.year.add("1990");
        this.year.add("1966");
        this.year.add("1998");
        this.year.add("2001");

    }

    protected Books(int x){

    }

    String list(){
        String listString = "";
        for (int i = 0; i < this.name.size(); i++) {
            listString += this.name.get(i) + "\t" + this.author.get(i) + "\t" + this.year.get(i) + "\n";
        }

        return listString;
    }

    String checkOut(String bookName){

        int index = this.name.indexOf(bookName);

        if(index == -1){
            return "That book is not available";
        }

        this.name.remove(index);
        this.author.remove(index);
        this.year.remove(index);

        return "Thank you! Enjoy the book";
    }

    String returnBook(String bookName, String bookAuthor,String bookYear){

        int index = this.name.indexOf(bookName);

        if(index != -1){
            return "That is not a valid book to return";
        }

        this.name.add(bookName);
        this.author.add(bookAuthor);
        this.year.add(bookYear);

        return "Thank you for returning the book";
    }
}
