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
public class Bai07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        System.out.print("N = ");
        int n = sc.nextInt();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(20);
        }
        System.out.println("MẢNG RANDOM VỪA SINH : ");
        MANG.in(n, a);
        remakeArray(n, a);
    }
    
    public static void remakeArray( int n, int a[]) {
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if( a[j] == a[i]) {
                    for(int k = j; k < n - 1; k++) {
                        a[k] = a[k + 1];
                    }
                    n--;
                    j--;
                }
            }
        }
        System.out.print("MẢNG ĐƯỢC TẠO LẠI : ");
        MANG.in(n, a);
    }
}
