/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BatTap5.Bai01;

import java.util.Vector;

/**
 *
 * @author Cuong
 */
public class BookBorrowManager {
    private static final int NUMBER_OF_BOOK_CAN_BORROW = 5;
    
    private Reader reader;

    public BookBorrowManager(Reader reader) {
        this.reader = reader;
    }
    
    private Vector<Book>bookVector;
    
    public void add(Book book) {
        bookVector.add(book);
    }
    
    public boolean canBorrowMore() {
        if (bookVector.size() != NUMBER_OF_BOOK_CAN_BORROW) {
            return true;
        }
        return false;
    }
    
    public int getNumberOfBook() {
        return bookVector.size();
    }
    
}
