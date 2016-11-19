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
public class SoNguyenLon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int la = a.length();
        int lb = b.length();
        String c = new String();
        if (la > lb) {
            c = cong(a, b);
        } else {
            c = cong(b, a);
        }
        System.out.println(c);
    }

    public static String cong(String a, String b) {
        StringBuilder sba = new StringBuilder(a);
        StringBuilder sbb = new StringBuilder(b);
        sba.reverse();
        sbb.reverse();
        for( int i = 0; i <= a.length() - b.length(); i++) {
            sbb.append('0');
        }
        
        StringBuilder sbr = new StringBuilder();
        int rm = 0;
        for( int i = 0; i < a.length(); i++) {
            int p = (sba.charAt(i) - '0') + (sbb.charAt(i) - '0') + rm;
            int rs = p % 10;
            rm = p / 10;
            sbr.append(rs);
        }
        
        while(sbr.charAt(sbr.length() - 1) == '0') {
            sbr.deleteCharAt(sbr.length() - 1);
        }
        
        sbr.reverse();
        return sbr.toString();
    }
}
