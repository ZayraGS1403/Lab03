package edu.eci.cvds.tdd.library.book;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {
    private Book book = new Book("the 100", "maria", "1234567");
    
    @Before
    public void setUp() {
        book = new Book("the 100", "maria", "1234567");
    }
    
    @Test
    public void testGetTittle() {
        assertEquals("the 100", book.getTittle());
    }
    
    @Test
    public void testGetAuthor() {
        assertEquals("maria", book.getAuthor());
    }
    
   
}