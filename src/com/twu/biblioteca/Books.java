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

        this.lendName.add("");
        this.lendName.add("");
        this.lendName.add("");
        this.lendName.add("");
    }

    protected Books(int x){

    }

    String list(){
        String listString = "";
        for (int i = 0; i < this.name.size(); i++) {
            if(this.lendName.get(i).equals("")){
                listString += this.name.get(i) + "\t" + this.author.get(i) + "\t" + this.year.get(i) + "\n";
            }
        }

        return listString;
    }

    String listCheckedout(ArrayList<Accounts> accounts){
        String listString = "";

        for (int i = 0; i < this.name.size(); i++) {
            if(!this.lendName.get(i).equals("")){
                listString += this.name.get(i) + "\t" + this.lendName.get(i) + "\t" + Accounts.findNumber(accounts, this.lendName.get(i)) + "\n";
            }
        }

        return listString;
    }

    String checkOut(String bookName){

        int index = this.name.indexOf(bookName);

        if(index != -1 && this.lendName.get(index).equals("")){
            return "Thank you! Enjoy the book";

        }

        return "That book is not available";
    }

    String checkOut(String bookName, String username){

        int index = this.name.indexOf(bookName);

        if(index != -1 && this.lendName.get(index).equals("")){
            this.lendName.set(index, username);
            return "Thank you! Enjoy the book";
        }

        return "That book is not available";
    }

    String returnBook(String bookName){

        int index = this.name.indexOf(bookName);

        if(index!=-1 && !this.lendName.get(index).equals("")){
            this.lendName.set(index, "");
            return "Thank you for returning the book";

        }else{
            return "That is not a valid book to return";
        }

    }
}
