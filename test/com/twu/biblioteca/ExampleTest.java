package com.twu.biblioteca;


import org.junit.Test;
import com.twu.biblioteca.Tools;

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

}
