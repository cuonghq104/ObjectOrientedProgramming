/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BatTap5.Bai02;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class SinhVien {
    private int id;
    
    private String name;
    
    private String address;
    
    private String pn;
    
    private String className;
    
    private static int autoID = 10000;

    public SinhVien() {
    
    }
    
    public void nhap(Scanner scanner) {
        System.out.print("Ten : ");
        name = scanner.nextLine();
        System.out.print("Dia chi : ");
        address = scanner.nextLine();
        System.out.print("Lop : ");
        className = scanner.nextLine();
        System.out.print("So dien thoai : ");
        pn = scanner.nextLine();
        id = autoID;
        autoID++;
    }
    
    public void in() {
        System.out.printf("%8d%15s%10s%15s%10s\n", id, name, address, pn, className);
    }
    
    public int compareStudentName(SinhVien sinhVien) {
        return this.name.compareTo(sinhVien.name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public boolean matchID(int id) {
        return id == this.id;
    }
    
    public boolean matchStudent(SinhVien sinhVien) {
        return matchID(sinhVien.id);
    }
}
