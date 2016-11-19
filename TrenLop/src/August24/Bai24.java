/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package August24;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < s.length()-1; i += 2) {
            sb.append(Character.toUpperCase(s.charAt(i)));
            sb.append(Character.toLowerCase(s.charAt(i + 1)));
        }
        
        System.out.println(sb.toString());
    }

}
