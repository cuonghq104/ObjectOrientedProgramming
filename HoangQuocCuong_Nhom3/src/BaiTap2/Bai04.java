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
public class Bai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        
        int a[] = new int[100];
        boolean check[] = new boolean[100];
        int appearance[] = new int[100];
        
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
            check[i] = false;
        }
        
        System.out.print("MẢNG VỪA NHẬP : ");
        MANG.in(n, a);
        System.out.println("Các phần tử và số lần xuất hiện của nó : ");
        
        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                appearance[i] = 1;
                for (int j = i + 1; j < n; j++) {
                    if (a[j] == a[i] && !check[i]) {
                        appearance[i]++;
                        check[j] = true;
                    }
                }
                System.out.println(a[i] + "\t" + appearance[i]);
            }
        }
    }
}
