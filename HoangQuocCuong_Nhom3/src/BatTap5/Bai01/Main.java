/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BatTap5.Bai01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cuong
 */
public class Main {

    public static void readFromFile(Vector<Book> bookVector, Vector<Reader> readerVector) {
        try {
            Scanner scanner = new Scanner(new File("BOOK.txt"));
            while (scanner.hasNext()) {
                Book book = new Book();
                book.readFromFile(scanner);
                bookVector.add(book);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Scanner scanner = new Scanner(new File("READER.txt"));
            while (scanner.hasNext()) {
                Reader reader = new Reader();
                reader.readFromFile(scanner);
                readerVector.add(reader);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        Vector<Book> bookVector = new Vector<>();
        Vector<Reader> readerVector = new Vector<>();
        readFromFile(bookVector, readerVector);

        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriterBook = null;
        PrintWriter printWriterReader = null;
        try {
            printWriterBook = new PrintWriter(new File("BOOK.txt"));
            printWriterReader = new PrintWriter(new File("READER.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        int command = 0;
        Vector<BookBorrowManager> bookBorrowManagers = new Vector<>();
        do {
            command = Menu.getCommand();
            switch (command) {
                case 0: {
                    for (Reader reader : readerVector) {
                        reader.printToFile(printWriterReader);
                    }
                    for (Book book : bookVector) {
                        book.printToFile(printWriterBook);
                    }
                    break;
                }
                case 1: {
                    Reader reader = new Reader();
                    reader.readFromKeyboard(scanner);
                    readerVector.add(reader);
                    break;
                }
                case 2: {
                    for (Reader reader : readerVector) {
                        System.out.println();
                        reader.printToScreen();
                    }
                    break;
                }
                case 3: {
                    Book book = new Book();
                    book.readFromKeyboard(scanner);
                    bookVector.add(book);
                    break;
                }
                case 4: {
                    for (Book book : bookVector) {
                        System.out.println();
                        book.printToScreen();
                    }
                    break;
                }
                case 5: {
                    for (Reader reader : readerVector) {
                        BookBorrowManager bookBorrowManager = new BookBorrowManager(reader);
                        System.out.println("BOOK LIST : ");

                        int key = 0;
                        do {
                            key = Menu.getCommandBorrowMenu();
                            boolean noMoreBookToBorrow = true;
                            System.out.println(bookVector.size());
                            for (Book book : bookVector) {
                                book.bookCondition();
                                if (book.isAvailble()) {
                                    noMoreBookToBorrow = false;
                                }
                            }
                            switch (key) {
                                case 0:
                                    break;
                                case 1:
                                    if (!bookBorrowManager.canBorrowMore()) {
                                        System.out.println("Can borrow anymore");
                                        break;
                                    }
                                    System.out.println("Enter book ID : ");
                                    int id;
                                    id = Integer.parseInt(scanner.nextLine());
                                    Book bk = null;
                                    for (Book book : bookVector) {
                                        if (book.matchID(id) && book.isAvailble()) {
                                            bk = book;
                                            book.borrowOne();
                                        }
                                    }
                                    if (bk == null) {
                                        System.out.println("Can't borrow");
                                    } else {
                                        bookBorrowManager.add(bk);
                                    }
                                    break;
                            }
                        } while (key != 0);

                    }
                }

            }
        } while (command != 0);
        printWriterReader.close();
        printWriterBook.close();
    }
}
