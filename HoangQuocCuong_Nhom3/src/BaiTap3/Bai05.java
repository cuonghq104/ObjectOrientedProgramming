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
public class Bai05 {
    
    public static StackOfIntegers phanTich(int n) {
        StackOfIntegers tmp = new StackOfIntegers();
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                tmp.push(i);
                n = n / i;
            } else {
                i++;
            }
        }
        return tmp;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        StackOfIntegers soi = phanTich(n);
        System.out.print("Phân tích " + n + " thành thừa số nguyên tố : ");
        Bai04.in(soi);
    }
}
