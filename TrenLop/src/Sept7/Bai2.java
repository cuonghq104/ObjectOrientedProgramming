/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sept7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Cuong
 */
public class Bai2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("ten.txt"));
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder kq = new StringBuilder("");
        while (st.hasMoreTokens()) {
            String t = st.nextToken();
            kq.append(Character.toUpperCase(t.charAt(0)));
            for (int i = 1; i < t.length(); i++) {
                kq.append(Character.toLowerCase(t.charAt(i)));
            }
            kq.append(" ");
        }
        System.out.println(kq);
    }
}