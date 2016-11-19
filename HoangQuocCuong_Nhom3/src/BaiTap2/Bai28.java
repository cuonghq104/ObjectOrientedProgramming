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
public class Bai28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một xâu : ");
        String s = sc.nextLine();
        System.out.println("Xâu vừa nhập : " + s);
        sortWordList(s);
    }

    public static void sortWordList(String s) {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder sb = new StringBuilder();
        String[] w = new String[20];
        int word = 0;
        while (st.hasMoreTokens()) {
            w[word] = st.nextToken();
            word++;
        }
        for (int i = 0; i < word - 1; i++) {
            for (int j = i + 1; j < word ; j++ ) {
                if( w[i].compareToIgnoreCase(w[j]) > 0) {
                    String tmp = w[i];
                    w[i] = w[j];
                    w[j] = tmp;
                }
            }
        }
        System.out.println("CÁC TỪ có trong xâu được sắp xếp theo từ điển : ");
        for(int i = 0; i < word; i++) {
            System.out.print(w[i] + "  ");
        }
        System.out.println();
    }
}
