/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BatTap5.Bai01;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Menu {
    public static int getCommand() {
        System.out.println("Enter : ");
        System.out.println("0.Exit");
        System.out.println("1: Add new reader");
        System.out.println("2: Show reader list");
        System.out.println("3: Add new book");
        System.out.println("4: Show book list");
        System.out.println("5. Add borrow manager");
        System.out.print("Enter : ");
        int key = 0;
        Scanner sc = new Scanner(System.in);
        do{
            key = Integer.parseInt(sc.nextLine());
            if (key < 0 || key > 5) {
                System.out.print("Again : ");
            }
        } while (key < 0 || key > 5);
        return key;
    }
    
    public static int getCommandBorrowMenu() {
        System.out.println("Enter : ");
        System.out.println("0. Exit");
        System.out.println("1. Borrow 1 more book");
        int key = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                key = Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException exception) {
                System.out.println("Again: ");
            }
            if (key != 0 && key != 1) {
                System.out.print("Again : ");
            }
        } while (key != 0 && key != 1);
        return key;
    }
}
