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
public class Bai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một xâu chưa được chuẩn hóa : ");
        String s = sc.nextLine();
        System.out.println("Xâu vừa nhập : " + s);
        System.out.println("Xâu được chuẩn hóa : " + chuanHoa(s));
    }
    
    public static String chuanHoa(String s) {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder sb = new StringBuilder();
        while(st.hasMoreTokens()) {
            String tmp = st.nextToken();
            sb.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i = 1; i < tmp.length(); i++) {
                sb.append(Character.toLowerCase(tmp.charAt(i)));
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
