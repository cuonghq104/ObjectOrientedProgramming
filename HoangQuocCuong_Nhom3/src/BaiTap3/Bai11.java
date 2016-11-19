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
public class Bai11 {

    public static boolean tamGiacVuong(double a, double b, double c) {
        if (a * a + b * b == c * c) {
            return true;
        }
        if (a * a + c * c == b * b) {
            return true;
        }
        if (b * b + c * c == a * a) {
            return true;
        }
        return false;
    }

    public static boolean tamGiacCan(double a, double b, double c) {
        if (a == b && a != c) {
            return true;
        }
        if (a == c && a != b) {
            return true;
        }
        if (b == c && b != a) {
            return true;
        }
        return false;
    }

    public static boolean tamGiacDeu(double a, double b, double c) {
        if (a == b && b == c) {
            return true;
        }
        return false;
    }

    public static void loaiTamGiac(double dab, double dac, double dbc) {
        if (tamGiacDeu(dab, dac, dbc)) {
            System.out.println("Bộ 3 đỉnh vừa nhập tạo thành một tam giác đều");
        } else if (tamGiacCan(dab, dac, dbc) && tamGiacVuong(dab, dac, dbc)) {
            System.out.println("Bộ 3 đỉnh vừa nhập tạo thành một tam giác vuông cân");
        } else if (tamGiacCan(dab, dac, dbc)) {
            System.out.println("Bộ 3 đỉnh vừa nhập tạo thành một tam giác cân");
        } else if (tamGiacVuong(dab, dac, dbc)) {
            System.out.println("Bộ 3 đỉnh vừa nhập tạo thành một tam giác vuông");
        } else {
            System.out.println("Bộ 3 đỉnh vừa nhập tạo thành một tam giác thường");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[A]");
        MyPoint a = Bai10.nhap();
        System.out.println("[B]");
        MyPoint b = Bai10.nhap();
        System.out.println("[C]");
        MyPoint c = Bai10.nhap();

        double dab = a.distance(b);
        double dac = a.distance(c);
        double dbc = b.distance(c);

        loaiTamGiac(dab, dac, dbc);
    }
}
