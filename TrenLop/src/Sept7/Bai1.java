/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sept7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Đọc dãy số nguyên từ file, sắp xếp và in ra kết quả
 * @author Cuong
 */

public class Bai1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("sn.txt"));
        int[] a = new int[100];
        int n = 0;
        while (sc.hasNext()) {
            int t = sc.nextInt();
            a[n++] = t;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        
        PrintWriter pw = new PrintWriter(new File("KQ.txt"));
        for (int i = 0; i < n; i++) {
            pw.printf("%6d", a[i]);
        }
        pw.close();
    }
    
}
