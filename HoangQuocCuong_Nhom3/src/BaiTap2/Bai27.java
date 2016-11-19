/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Cuong
 */
public class Bai27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một xâu họ tên : ");
        String s = sc.nextLine();
        System.out.println("Họ tên theo Họ - đệm - tên : " + s);
        System.out.println("Họ tên được chuyển lại theo Tên - Họ - Đệm : " + changeNameStructure(s));
    }

    public static String changeNameStructure(String name) {
        StringTokenizer st = new StringTokenizer(name);
        StringBuilder sb = new StringBuilder();
        String[] s = new String[10];
        int word = 0;
        while (st.hasMoreTokens()) {
            s[word] = st.nextToken();
            word++;
        }
        sb.append(s[word - 1]);
        sb.append(" ");
        for (int i = 0; i < word - 1; i++) {
            sb.append(s[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}
