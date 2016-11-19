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
public class Bai06 {

    public static StackOfIntegers chuyenCoSo(int n, int b) {
        StackOfIntegers tmp = new StackOfIntegers();
        while (n > 0) {
            tmp.push(n % b);
            n = n / b;
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        StackOfIntegers soi = chuyenCoSo(n, 2);
        System.out.print("Chuyển đổi " + n + " sang cơ số : ");
        Bai04.in(soi);
    }
}
