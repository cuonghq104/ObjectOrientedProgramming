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
public class Bai30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập xâu s1 : ");
        String s1 = sc.next();
        System.out.print("Nhập xâu s2 : ");
        String s2 = sc.next();
        s1 = removeS2(s1, s2);
        System.out.println("Xâu s1 sau khi loại bỏ s2 : " + s1);
    }
    // abcd
    // aaabcdbcdbcdcd
    public static String removeS2(String s1, String s2) {
        StringBuilder sb = new StringBuilder(s1);
        while(s1.contains(s2)) {
            int i = s1.indexOf(s2);
            sb.delete(i, i + s2.length());
            s1 = sb.toString();
        }
        return sb.toString();
    }
}
