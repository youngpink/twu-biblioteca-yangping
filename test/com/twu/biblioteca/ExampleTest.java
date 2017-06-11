package com.twu.biblioteca;


import org.junit.Test;
import com.twu.biblioteca.Tools;
import com.twu.biblioteca.Books;

import static org.junit.Assert.assertEquals;


public class ExampleTest {

    Tools tool = new Tools();
    Books book = new Books();

    @Test
    public void testListBook() {
        String expectText = "语文\t张三\t1990\n" +
                "数学\t李四\t1966\n" +
                "英语\t王五\t1998\n" +
                "物理\t赵六\t2001\n";
        assertEquals(expectText, book.listBook());
    }

    public void testCheckOutBookFirst() {
        assertEquals(false, book.checkOutBook("化学"));
    }

    public void testCheckOutBookScond() {
        assertEquals(true, book.checkOutBook("物理"));
    }

//    public void testCheckOutFirst() {
//        assertEquals("That book is not available",tool.checkOut(book));
//    }
//
//    public void testCheckOutScond() {
//        assertEquals("Thank you! Enjoy the book", tool.checkOut(book));
//    }

}
