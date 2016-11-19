/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai04 {
    public static boolean primeNumberCheck(int n) {
        if(n < 2)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    
    public static void in(StackOfIntegers soi) {
        while(!soi.isEmpty()) {
            System.out.printf("%3d", soi.pop());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào n = ");
        int n = sc.nextInt();
        StackOfIntegers soi = new StackOfIntegers(100);
        for (int i = 2; i <= n; i++) {
            if (primeNumberCheck(i)) {
                soi.push(i);
            }
        }
        
        System.out.print("Danh sách các số nguyên tố nhỏ hơn " + n + " : ");
        in(soi);
    }
}
