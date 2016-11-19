/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai08 {

    public static boolean morePriority(char x, char y) {
        if (x == '+' || x == '-') {
            return false;
        } else {
            if (y == '*' || y == '/') {
                return false;
            }
            return true;
        }
    }

    public static int thucHienPhepTinh(int a, int b, char pt) {
        switch (pt) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }
        return 0;
    }

    public static int giaTri(String s) {
        int giaTri = 0;
        StackOfChars toanTu = new StackOfChars(20);
        StackOfIntegers toanHang = new StackOfIntegers(20);

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x >= '0' && x <= '9') {
                toanHang.push(x - '0');
            }
            
            else if (x == '(') {
                toanTu.push(x);
            }
            
            else if (x == '+' || x == '-' || x == '*' || x == '/') {
                if (toanTu.isEmpty() || toanTu.peak() == '(') {
                    toanTu.push(x);
                } else {
                    char y = toanTu.peak();
                    if (morePriority(x, y)) {
                        
                        toanTu.push(x);
                    } else {
                        int a = toanHang.pop();
                        int b = toanHang.pop();
                        char pt = toanTu.pop();
                        int kq = thucHienPhepTinh(a, b, pt);
                        toanHang.push(kq);
                        toanTu.push(x);
                    }
                }
            }
            
            else if(x == ')') {
                while(toanTu.peak() != '(') {
                    int a = toanHang.pop();
                    int b = toanHang.pop();
                    char c = toanTu.pop();
                    int kq = thucHienPhepTinh(a, b, c);
                    toanHang.push(kq);
                }
            }
//            System.out.println(toanHang.peak());
        }
        return toanHang.peak();
    }

    public static void main(String[] args) {
        StackOfChars soc = new StackOfChars(20);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào biểu thức trung tố : ");
        String s = sc.next();
        int gt = giaTri(s);
        System.out.println("Giá trị của biểu thức : " + gt);
    }
}
