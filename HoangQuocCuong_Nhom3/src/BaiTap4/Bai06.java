/*
 * Search
 */
package BaiTap4;

import java.io.*;
import java.util.*;

/**
 *
 * @author Cuong
 */
public class Bai06 {

    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(90) + 10;
        Scanner sc = null;
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File("TIMKIEMTT.OUT"));
            sc = new Scanner(new File("DAYSO.TXT"));

            pw.println("Tìm kiếm số : " + n);
            int size = sc.nextInt();
            int[] a = new int[size];

            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }

            int i = 0;
            
            for (i = 0; i < size; i++) {
                pw.println("Bước " + i + " : " + a[i]);
                if (n == a[i]) {
                    pw.println("Tìm thấy\n");
                    break;
                } else {
                    pw.println("Chưa tìm thấy\n");
                }
            }
            
            if (i == size) {
                pw.println("=> Không tìm thấy");
            }
        } catch (FileNotFoundException ex) {
            pw.println("Khong tim duoc file");
        } finally {
            pw.close();
        }
    }
}
