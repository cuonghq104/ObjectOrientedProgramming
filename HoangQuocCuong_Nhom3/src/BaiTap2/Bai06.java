/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        System.out.print("N = ");
        int n = sc.nextInt();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(100);
        }
        System.out.println("MẢNG RANDOM VỪA SINH : ");
        MANG.in(n, a);
        appearanceCount(n, a);
    }

    public static void appearanceCount(int n, int a[]) {
        boolean check[] = new boolean[100];
        System.out.print("Các giá trị khác nhau trong dãy : ");
        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                System.out.print(a[i] + "   ");
                check[i] = true;
                for (int j = i + 1; j < n; j++) {
                    if (a[j] == a[i]) {
                        check[j] = true;
                    }
                }
            }
        }
        System.out.println();
    }
}
