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
public class Bai10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int[] a = new int[100];
        System.out.print("NHẬP MẢNG : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("MẢNG VỪA NHẬP : ");
        MANG.in(n, a);
        theLongestRunning(a, n);
    }

    public static void theLongestRunning(int a[], int n) {
        int max = 0;
        int begin = 0;
        for (int i = 0; i < n; i++) {
            int length = 0;
            int j = i;
            int counter = 1;
            while (a[j + 1] > a[j]) {
                j++;
                counter++;
            }
            if (counter > max) {
                max = counter;
                begin = i;
            }
            if (max > n - i) {
                break;
            }
        }
        System.out.println("ĐƯỜNG CHẠY DÀI NHẤT : " + max);
        System.out.println("BẮT ĐẦU : " + begin);
    }
}
