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
public class Bai02 {
    public static void in(SinhVien ds[], int n) {
        System.out.printf("%20s %10s %10s %10s\n", "Họ tên", "ID", "Khóa", "Lớp");
        for (int i = 0; i < n; i++) {
            ds[i].in();
        }
    }

    public static void sapXepTen(SinhVien ds[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ds[i].getName().compareTo(ds[j].getName()) > 0) {
                    SinhVien tmp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = tmp;
                } 
            }
        }
    }
    
    public static void sapXepLop(SinhVien ds[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ds[i].getClassName().compareTo(ds[j].getClassName()) > 0) {
                    SinhVien tmp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = tmp;
                } 
            }
        }
    }
    
    public static void main(String[] args) {
        SinhVien[] ds = new SinhVien[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Số sinh viên : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("[" + (i + 1) + "]");
            ds[i] = new SinhVien();
            ds[i].nhap();
        }
        System.out.println("Danh sách sinh viên vừa nhập : ");
        in(ds, n);
        System.out.println("Danh sách sinh viên sau khi được sắp xếp theo tên : ");
        sapXepTen(ds, n);
        in(ds, n);
        System.out.println("Danh sách sinh viên sau khi được sắp xếp theo lớp : ");
        sapXepLop(ds, n);
        in(ds, n);
        
    }
}
