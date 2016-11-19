/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebeliever;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        File fi = new File("INPUT.TXT");
        PrintWriter pw = new PrintWriter(new File("OUTPUT.TXT"));
        Scanner sc = new Scanner(fi);
        int n = Integer.parseInt(sc.nextLine());
        SinhVien[] sv = new SinhVien[100];
        for (int i = 0; i < n; i++) {
            sv[i] = new SinhVien();
            sv[i].nhap(sc);
        }
        pw.println("DANH SÁCH SINH VIÊN : ");
        for (int i = 0; i < n; i++) {
            sv[i].in(pw);
        }
        System.out.println("DANH SÁCH SINH VIÊN : ");
        for (int i = 0; i < n; i++) {
            sv[i].in();
        }

        pw.close();
    }

}
