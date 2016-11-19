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
public class Bai29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào xâu A : ");
        String a = sc.nextLine();
        System.out.println("Xâu vừa nhập : " + a);
        String[] waa = wordArrays(a);

        System.out.print("Nhập vào xâu B : ");
        String b = sc.nextLine();
        System.out.println("Xâu vừa nhập : " + b);
        String[] wab = wordArrays(b);
        System.out.println(waa[0] + " " + wab[0]);
        System.out.print("Giao của hai tập từ : ");
        for (int i = 1; i < Integer.parseInt(waa[0]); i++) {
            boolean found = false;
            for (int j = 1; j < Integer.parseInt(wab[0]); j++) {
                if (waa[i].compareTo(wab[j]) == 0) {
                    found = true;
                }
            }
            if (found) {
                System.out.print(waa[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Hiệu của hai tập từ : ");
        for (int i = 1; i < Integer.parseInt(waa[0]); i++) {
            boolean found = false;
            for (int j = 1; j < Integer.parseInt(wab[0]); j++) {
                if (waa[i].compareTo(wab[j]) == 0) {
                    found = true;
                }
            }
            if(!found) {
                System.out.print(waa[i] + " ");
            }
        }
    }
    
    public static String[] wordArrays(String s) {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder sb = new StringBuilder();
        String[] w = new String[20];
        int word = 1;
        while (st.hasMoreTokens()) {
            w[word] = st.nextToken();
            word++;
        }
        w[0] = Integer.toString(word);
        return w;
    }

}
