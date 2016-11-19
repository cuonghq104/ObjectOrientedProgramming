/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai03 {

    public static void bubble_sort(int a[], int size, PrintWriter pw) {
        int step = 1;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] < a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
                DaySo.in(a, size, step, pw);
                step++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = null;
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File("BUBBLESORT.OUT"));
            sc = new Scanner(new File("DAYSO.TXT"));
            int size = sc.nextInt();
            int[] a = new int[size];
            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }
            bubble_sort(a, size, pw);
        } catch (FileNotFoundException ex) {
            pw.println("File khong ton tai");
        } finally {
            pw.close();
        }
    }

}
