package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/13.
 */
public abstract class Goods {
    protected ArrayList<String> name = new ArrayList<String>();
    protected ArrayList<String> author = new ArrayList<String>();
    protected ArrayList<String> year = new ArrayList<String>();

    public Goods(){}

    abstract String list();

    abstract String checkOut(String bookName);

}
