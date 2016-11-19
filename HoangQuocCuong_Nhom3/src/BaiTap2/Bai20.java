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
public class Bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        String kq = doiCoSo(n, b);
        System.out.println("Đổi " + n + " sang hệ cơ số " + b + " : " + kq);
    }
    
    public static String doiCoSo(int n, int b) {
        StringBuilder sb = new StringBuilder();
        while( n > 0) {
            int tmp = n % b;
            if(tmp < 10) {
                sb.append(tmp);
            }
            else {
                sb.append((char) (tmp - 10 + 'A'));
            }
            n = n / b;
        }
        sb.reverse();
        return sb.toString();
    }
}
