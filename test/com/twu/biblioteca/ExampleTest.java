package com.twu.biblioteca;


import org.junit.Test;
import com.twu.biblioteca.Tools;
import com.twu.biblioteca.Books;

import static org.junit.Assert.assertEquals;


public class ExampleTest {

    Tools tool = new Tools();
    Books book = new Books();
    Goods movie = new Movies();
    Accounts amy = new Users("123-1234","123","8560123");

    @Test
    public void testListBook() {
        String expectText = "语文\t张三\t1990\n" +
                "数学\t李四\t1966\n" +
                "英语\t王五\t1998\n" +
                "物理\t赵六\t2001\n";
        assertEquals(expectText, book.list());
    }

    public void testCheckOutBookFirst() {
        assertEquals("That book is not available", book.checkOut("化学"));
    }

    public void testCheckOutBookScond() {
        assertEquals("Thank you! Enjoy the book", book.checkOut("物理"));
    }

    public void testReturnBookFirst() {
        assertEquals("Thank you for returning the book", book.returnBook("化学","马七", "2002"));
    }

    public void testReturnBookScond() {
        assertEquals("That is not a valid book to return",  book.returnBook("物理", "赵六", "2001"));
    }

    public void testListMovie() {
        String expectText = "蝙蝠侠\t蒂姆\t1990\t9.5\n" +
                "蜘蛛侠\t斯瓦克汉默\t2002\t9.5\n" +
                "钢铁侠\t乔恩\t2008\t9.5\n" +
                "超人\t理查德\t1973\tunrating\n";
        assertEquals(expectText, movie.list());
    }

    public void tesLoginFirst() {
        assertEquals(true, amy.login("123-1234", "123"));
    }

    public void tesLoginSecond() {
        assertEquals(false, amy.login("123-1234", "1"));
    }
}
