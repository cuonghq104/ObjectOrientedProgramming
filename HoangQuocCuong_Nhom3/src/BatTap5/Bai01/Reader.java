/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BatTap5.Bai01;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Reader {
    private int ID;
    
    private String name;
    
    private String address;
    
    private int type;
    
    private String phoneNumber;
    
    Reader() {
        
    }
    
    public void readFromKeyboard(Scanner scanner) {
        System.out.print("ID : ");
        ID = Integer.parseInt(scanner.nextLine());
        System.out.print("NAME : ");
        name = scanner.nextLine();
        System.out.print("ADDRESS : ");
        address = scanner.nextLine();
        System.out.println("Note: type : 1.Student, 2.Master student, 3.Teacher");
        System.out.print("READER TYPE : ");
        type = Integer.parseInt(scanner.nextLine());
        System.out.print("PHONE NUMBER : ");
        phoneNumber = scanner.nextLine();
    }
    
    public void readFromFile(Scanner scanner) {
        ID = Integer.parseInt(scanner.nextLine());
        name = scanner.nextLine();
        address = scanner.nextLine();
        type = Integer.parseInt(scanner.nextLine());
        phoneNumber = scanner.nextLine();

    }
    
    public void printToScreen() {
        System.out.println("ID : " + ID);
        System.out.println("NAME : " + name);
        System.out.println("ADDRESS : " + address);
        System.out.println("PHONE NUMBER : " + phoneNumber);
        System.out.print("READER TYPE : ");
        switch(type) {
            case 1:
                System.out.println("STUDENT");
                break;
            case 2:
                System.out.println("MASTER STUDENT");
                break;
            case 3:
                System.out.println("TEACHER");
                break;
        }
    }
    
    public void printToFile(PrintWriter printWriter) {
        printWriter.println(ID);
        printWriter.println(name);
        printWriter.println(address);
        printWriter.println(type);
        printWriter.println(phoneNumber);
    }
}
