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
public class Bai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int[] a = new int[100];
        System.out.print("NHẬP MẢNG THEO THỨ TỰ TĂNG DẦN: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("MẢNG VỪA NHẬP : ");
        MANG.in(n, a);
        System.out.print("X = ");
        int x = sc.nextInt();
        insertNumber(x, a, n);
    }
    
    public static void insertNumber( int x, int a[], int n) {
        int i = 0; 
        while( a[i] < x && i < n) {
            i++;
        }
        for(int j = n; j > i; j--) {
            a[j] = a[j - 1];
        }
        a[i] = x;
        n++;
        System.out.print("MẢNG SAU KHI CHÈN : ");
        MANG.in(n, a);
    }
}
