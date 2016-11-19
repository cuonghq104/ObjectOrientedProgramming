/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int[] a = new int[100];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        System.out.print("MẢNG VỪA NHẬP : ");
        MANG.in(n, a);
        System.out.print("X = ");
        int x = sc.nextInt();
        int min = 10000, pos = -1;
        for (int i = 0; i < n; i++) {
            if (primeNumberCheck(a[i]) && Math.abs(a[i] - x) < min) {
                min = Math.abs(a[i] - x);
                pos = i;
            }
        }
        if (pos != -1) {
            System.out.println("Vị trí cần tìm : " + pos);
        } else {
            System.out.println("Không tìm thấy số phù hợp");
        }
    }

    public static boolean primeNumberCheck(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
