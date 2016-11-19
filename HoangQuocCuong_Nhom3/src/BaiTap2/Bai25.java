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
public class Bai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một xâu : ");
        String s = sc.nextLine();
        System.out.println("Xâu vừa nhập : " + s);
        theLongestWord(s);
    }
    
    public static void theLongestWord(String s) {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder sb = new StringBuilder();
        int max = 0;
        int pos = 0;
        String kq = new String();
        int counter = 1;
        while(st.hasMoreTokens()) {
            String tmp = st.nextToken();
            if( tmp.length() > max) {
                max = tmp.length();
                kq = tmp;
                pos = counter;
            }
            counter++;
        }
        System.out.println("Từ dài nhất là " + kq + " và ở vị trí " + pos );
    }
}
