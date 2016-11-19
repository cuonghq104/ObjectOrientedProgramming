/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai07 {

    public static int step = 1;

    public static void binary_search(int n, int a[], int left, int right, PrintWriter pw) {
        if (left < right) {
            int middle = (left + right) / 2;
            pw.println("Bước " + step + " : " + a[middle]);
            step++;
            if (a[middle] == n) {
                pw.println("Tìm thấy");
                return;
            }
            if (n < a[middle]) {
                pw.println("Không tìm thấy");
                binary_search(n, a, left, middle, pw);
            } else if (n > a[middle]) {
                pw.println("Không tìm thấy");
                binary_search(n, a, middle + 1, right, pw);
            }
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(90) + 10;
        Scanner sc = null;
        PrintWriter pw = null;
        PrintWriter pw2 = null;

        try {
            pw = new PrintWriter(new File("TIMKIEMNP.OUT"));
            pw2 = new PrintWriter(new File("QUICKSORT.OUT"));
            sc = new Scanner(new File("DAYSO.TXT"));

            pw.println("Tìm kiếm số : " + n);
            int size = sc.nextInt();
            int[] a = new int[size];

            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }

            Bai04.quickSort(a, size, 0, size - 1, 0, pw2);

            binary_search(n, a, 0, size - 1, pw);
            
        } catch (FileNotFoundException ex) {
            pw.println("Khong tim duoc file");
        } finally {
            pw.close();
            pw2.close();
        }
    }
}
