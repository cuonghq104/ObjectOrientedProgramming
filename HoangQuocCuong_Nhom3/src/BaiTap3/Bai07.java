/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai07 {

    public static boolean morePriority(char x, char y) {
        if (x == '+' || x == '-') {
            if (y == '+' || y == '-') {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    public static String chuyenHauTo(String s) {
        String out = new String();
        StackOfChars soc = new StackOfChars(20);
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == '(') {
                soc.push(x);
            } else if (x >= '0' && x <= '9') {
                out = out + x;
            } else if (x == '+' || x == '-' || x == '*' || x == '/') {
                if (soc.isEmpty()) {
                    soc.push(x);
                } else {
                    char y = soc.peak();
                    if (y == '(' || morePriority(x, y)) {
                        soc.push(x);
                    } else {
                        y = soc.pop();
                        out = out + y;
                        soc.push(x);
                    }
                }
            } else if (x == ')') {
                char y = soc.pop();
                while (y != '(') {
                    out = out + y;
                    y = soc.pop();
                }
            }
        }
        while (!soc.isEmpty()) {
            char y = soc.pop();
            out = out + y;
        }
        return out;
    }

    public static void main(String[] args) {
        StackOfChars soc = new StackOfChars(20);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào biểu thức trung tố : ");
        String s = sc.next();
        String cht = chuyenHauTo(s);
        System.out.println("Chuyển hậu tố : " + cht);
    }
}
