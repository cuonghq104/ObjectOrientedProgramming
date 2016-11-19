/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai13 {
    public static void splitPrime(int n) {
        System.out.print(n + " = ");
        int i = 2;
        while ( n != 1) {
            if( i == n) {
                System.out.print(i);
                n = n / i;
            }
            if( n % i == 0) {
                System.out.print(i + " x ");
                n = n / i;
            }
            else {
                i++;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        splitPrime(n);
        System.out.println();
    }
}
