package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2017/6/17.
 */
public class GoodsTestWithBooksMovies {

    ArrayList<Goods> books = new ArrayList<Goods>(){{
        add(new Books("chinese", "an", "1980"));
        add(new Books("math", "blue", "1990"));
        add(new Books("english", "may", "2010"));
    }};

    ArrayList<Goods> movies = new ArrayList<Goods>(){{
        add(new Movies("蝙蝠侠", "蒂姆", "1943", "9.5"));
        add(new Movies("蜘蛛侠", "斯瓦克汉默", "2002", "9.6"));
        add(new Movies("钢铁侠", "乔恩", "2008", ""));
    }};

    @Test
    public void testFindByName(){

        assertEquals(1, Goods.findByName(books, "math"));
        assertEquals(2, Goods.findByName(movies, "钢铁侠"));
        assertEquals(-1, Goods.findByName(books, "logic"));
        assertEquals(-1,Goods.findByName(movies, "超人"));
    }

    @Test
    public void testListWithBooks(){

        assertEquals("chinese\tan\t1980\nmath\tblue\t1990\nenglish\tmay\t2010\n", Books.list(books));
    }
    @Test
    public void testListCheckedOutWithNotNull(){
        Accounts amy = new Accounts("123-0001", "123456", "027-12345678", "amy@gmail.com");
        amy.checkOut(books, "math");
        assertEquals("math\t123-0001\t027-12345678\n", Books.listCheckedout(books, "027-12345678"));
    }

    @Test
    public void testListCheckedOutWithNull(){
        assertEquals("", Books.listCheckedout(books, "027-12345678"));
    }

    @Test
    public void testListMovies(){
        ArrayList<Movies> films = new ArrayList<Movies>(){{
            add(new Movies("蝙蝠侠", "蒂姆", "1943", "9.5"));
            add(new Movies("蜘蛛侠", "斯瓦克汉默", "2002", "9.6"));
            add(new Movies("钢铁侠", "乔恩", "2008", ""));
        }};

        assertEquals("蝙蝠侠\t蒂姆\t1943\t9.5\n蜘蛛侠\t斯瓦克汉默\t2002\t9.6\n钢铁侠\t乔恩\t2008\t\n", Movies.list(films));
    }

}
