/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BatTap5.Bai01;

import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Book implements Serializable {

    private int bookID;

    private String bookName;

    private String bookAuthor;

    private int bookSpeciality;

    private int establishedYear;

    private int numberOfBookLeft;
    
    public Book() {

    }
    
    public void readFromKeyboard(Scanner scanner) {
        try {
            System.out.print("BOOK ID : ");
            bookID = Integer.parseInt(scanner.nextLine());
            System.out.print("BOOK NAME : ");
            bookName = scanner.nextLine();
            System.out.print("BOOK AUTHOR : ");
            bookAuthor = scanner.nextLine();
            System.out.println("NOTE : MAJOR : 1. Science, 2. Literature and arts, 3. Electronic, 4. Information Technology");
            System.out.print("BOOK SPECIALITY : ");
            bookSpeciality = Integer.parseInt(scanner.nextLine());
            System.out.print("ESTABLISHED YEAR : ");
            establishedYear = Integer.parseInt(scanner.nextLine());
            numberOfBookLeft = 3;
        } catch (NumberFormatException exception) {
            System.out.println("Lỗi nhập");
        }
    }

    public void printToScreen() {
        System.out.println("ID : " + bookID);
        System.out.println("NAME : " + bookName);
        System.out.println("AUTHOR : " + bookAuthor);
        System.out.println("SPECIALITY : " + bookSpeciality);
        System.out.println("ESTABLISHED YEAR : " + establishedYear);
    }

    public void printToFile(PrintWriter printWriter) {
        printWriter.println(bookID);
        printWriter.println(bookName);
        printWriter.println(bookAuthor);
        printWriter.println(bookSpeciality);
        printWriter.println(establishedYear);
    }

    public void readFromFile(Scanner scanner) {
        bookID = Integer.parseInt(scanner.nextLine());
        bookName = scanner.nextLine();
        bookAuthor = scanner.nextLine();
        bookSpeciality = Integer.parseInt(scanner.nextLine());
        establishedYear = Integer.parseInt(scanner.nextLine());
        numberOfBookLeft = 3;
    }
    
    public void bookCondition() {
        System.out.printf("%5d%10s%5d\n", bookID, bookName, numberOfBookLeft);
    }
    
    public boolean isAvailble() {
        if (numberOfBookLeft == 0) {
            return false;
        }
        return true;
    }
    
    public boolean matchID(int id) {
        if (id == bookID) {
            return true;
        }
        return false;
    }
    
    public void borrowOne() {
        numberOfBookLeft--;
    }
}
