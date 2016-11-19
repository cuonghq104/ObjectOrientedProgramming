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
public class Bai08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int[] a = new int[100];
        System.out.print("NHẬP MẢNG A : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("MẢNG A : ");
        MANG.in(n, a);
        System.out.print("M = ");
        int m = sc.nextInt();
        int[] b = new int[100];
        System.out.print("NHẬP MẢNG B : ");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        System.out.print("MẢNG B : ");
        MANG.in(m, b);
        System.out.print("p = ");
        int p = sc.nextInt();
        insertArray(a, n, b, m, p);
    }

    public static void insertArray(int a[], int n, int b[], int m, int p) {
        int[] tmp = new int[100];
        for (int i = 0; i < n - p; i++) {
            tmp[i] = a[i + p];
        }
        for (int i = 0; i < m; i++) {
            a[i + p] = b[i];
        }
        for (int i = 0; i < n - p; i++) {
            a[i + p + m] = tmp[i];
        }
        n = n + m;
        System.out.print("MẢNG SAU KHI CHÈN : ");
        MANG.in(n, a);
    }
}
