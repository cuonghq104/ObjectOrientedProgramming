/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class SinhVien {
    private String name;
    private int id;
    private int schoolYear;
    private String className;
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên SV   : ");
        name = sc.nextLine();
        System.out.print("Mã số SV : ");
        id = Integer.parseInt(sc.nextLine());
        System.out.print("Khóa     : ");
        schoolYear = Integer.parseInt(sc.nextLine());
        System.out.print("Lớp SV   : ");
        className = sc.nextLine();
    }

    public String getClassName() {
        return className;
    }

    public String getName() {
        return name;
    }
    
    public void in() {
        System.out.printf("%20s %10d %10d %10s\n", name, id, schoolYear, className);
    }
}
