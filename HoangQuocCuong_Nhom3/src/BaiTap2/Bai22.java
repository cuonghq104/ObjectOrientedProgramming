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
public class Bai22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào xâu : ");
        String s = sc.next();
        System.out.println("Xâu vừa nhập : " + s);
        System.out.println("Xâu được thay đổi : " + editString(s));
    }

    public static String editString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            sb.append(Character.toUpperCase(s.charAt(i)));
            if (i != s.length() - 1) {
                sb.append(Character.toLowerCase(s.charAt(i + 1)));
            }
        }
        return sb.toString();
    }
}
