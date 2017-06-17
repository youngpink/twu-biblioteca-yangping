package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Movies extends Goods{

    String rating;

    public Movies(String name, String author, String year, String rating) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }

    static String list(ArrayList<Movies> goods){
        String listString = "";
        for (int i = 0; i < goods.size(); i++) {
            listString += goods.get(i).getName() + "\t" + goods.get(i).getAuthor() + "\t" + goods.get(i).getYear() + "\t" + goods.get(i).getRating() + "\n";
        }

        return listString;
    }
}
