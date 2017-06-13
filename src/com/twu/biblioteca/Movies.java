package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Movies extends Goods{
    private ArrayList<String> rating = new ArrayList<String>();

    public Movies() {
        this.name.add("蝙蝠侠");
        this.name.add("蜘蛛侠");
        this.name.add("钢铁侠");
        this.name.add("超人");

        this.author.add("蒂姆");
        this.author.add("斯瓦克汉默");
        this.author.add("乔恩");
        this.author.add("理查德");

        this.year.add("1943");
        this.year.add("2002");
        this.year.add("2008");
        this.year.add("1973");

        this.rating.add("9.5");
        this.rating.add("9.6");
        this.rating.add("9.1");
        this.rating.add("unrating");
    }

    String list(){
        String listString = "";
        for (int i = 0; i < this.name.size(); i++) {
            listString += this.name.get(i) + "\t" + this.author.get(i) + "\t" + this.year.get(i) + "\t" + this.rating.get(i) + "\n";
        }

        return listString;
    }

    String checkOut(String bookName){
        int index = this.name.indexOf(bookName);

        if(index == -1){
            return "That movie is not available";
        }

        this.name.remove(index);
        this.author.remove(index);
        this.year.remove(index);

        return "Thank you! Enjoy the movie";
    }

    boolean returnBook(String bookName, String bookAuthor,String bookYear){
        return true;
    }

}
