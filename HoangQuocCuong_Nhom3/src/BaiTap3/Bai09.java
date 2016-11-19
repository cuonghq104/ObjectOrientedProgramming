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
public class Bai09 {

    public static void chuyenCoSo(int n, int b) {
        StackOfChars soc = new StackOfChars(20);
        while (n != 0) {
            int t = n % b;
            if (t < 10) {
                soc.push((char) (t + '0'));
            } else {
                soc.push((char) (t + 55));
            }
            n = n / b;
        }
        while (!soc.isEmpty()) {
            System.out.print(soc.pop());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số tự nhiên N = ");
        int n = sc.nextInt();
        System.out.print("Cơ số B = ");
        int b = sc.nextInt();
        System.out.print("Chuyển " + n + " sang hệ cơ số " + b + " : ");
        chuyenCoSo(n, b);
        System.out.println();
    }
}
