package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/13.
 */
public abstract class Goods {
//    protected ArrayList<String> name = new ArrayList<String>();
//    protected ArrayList<String> author = new ArrayList<String>();
//    protected ArrayList<String> year = new ArrayList<String>();
//    protected ArrayList<String> lendName = new ArrayList<String>();
    String name;
    String author;
    String year;
    String lendName = "";

    public Goods(String name, String author, String year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public Goods(){};

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    public String getLendName() {
        return lendName;
    }

    public void setLendName(String lendName) {
        this.lendName = lendName;
    }

    static int findByName(ArrayList<Goods> Goods, String name){
        for(int i = 0; i < Goods.size(); i++){
            if(Goods.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

}
