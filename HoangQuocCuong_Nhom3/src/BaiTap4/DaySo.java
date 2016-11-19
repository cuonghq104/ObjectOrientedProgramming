/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import java.io.PrintWriter;

import java.io.*;
import java.util.*;

/**
 *
 * @author Cuong
 */
public class DaySo {
    
    public static void in(int a[], int size, int step, PrintWriter pw) {
        pw.print("Step " + step + " : ");
        for (int i = 0; i < size; i++) pw.print(a[i] + " ");
        pw.println();
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new File("DAYSO.TXT"));
        System.out.print("Số phần tử : ");
        int size = sc.nextInt();
        pw.println(size);
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            int n = r.nextInt(90) + 10;
            pw.print(n + " ");
            System.out.printf("%4d", n);
        }
        System.out.println();
        pw.close();
    }
}
