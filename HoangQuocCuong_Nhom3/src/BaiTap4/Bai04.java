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
public class Bai04 {

    public static int step = 1;
    
    public static int partition(int a[], int left, int right, int size, 
            PrintWriter pw) {
        
        int j = left - 1;
        int x = a[right];
        for (int i = left; i < right; i++) {
            if (a[i] < x) {
                j++;
                int tmp = a[j];
                a[j] = a[i];
                a[i] = tmp;
                in(a, size, pw);
            }
        }
        int tmp = a[j + 1];
        a[j + 1] = a[right];
        a[right] = tmp;
        in(a, size, pw);
        return j + 1;
    }

    public static void in(int a[], int size, PrintWriter pw) {
        pw.print("Step " + step + " : ");
        step++;
        for (int i = 0; i < size; i++) pw.print(a[i] + " ");
        pw.println();
    }
    
    public static void quickSort(int a[], int size, int left, int right, int step, PrintWriter pw) {
        if (left < right) {
            int partition = partition(a, left, right, size, pw);
            quickSort(a, size, left, partition - 1, step, pw);
            quickSort(a, size, partition + 1, right, step, pw);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[100];
        PrintWriter pw = null;
        Scanner sc = null;
        try {
            sc = new Scanner(new File("DAYSO.TXT"));
            pw = new PrintWriter(new File("QUICKSORT.TXT"));
            int size = sc.nextInt();
            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }
            int step = 0;
            
            quickSort(a, size, 0, size - 1, step, pw);

            
        } catch (FileNotFoundException ex) {
             pw.println("Khong tim thay file");
        } finally {
            pw.close();
        }
    }
}
