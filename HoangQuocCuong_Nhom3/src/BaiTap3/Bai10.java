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
public class Bai10 {

    public static void longestDistance(MyPoint[] p, int n) {
        double max = 0;
        int p1 = -1, p2 = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (p[i].distance(p[j]) > max) {
                    max = p[i].distance(p[j]);
                    p1 = i;
                    p2 = j;
                }
            }
        }
        System.out.println("Khoảng cách lớn nhất là : " + max + " giữa hai điểm " + p[p1] + " và " + p[p2]);
    }

    public static MyPoint nhap() {
        MyPoint tmp;
        Scanner sc = new Scanner(System.in);
        System.out.print("   x = ");
        int x = sc.nextInt();
        System.out.print("   y = ");
        int y = sc.nextInt();
        tmp = new MyPoint(x, y);
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        MyPoint[] p = new MyPoint[n];
        for (int i = 0; i < n; i++) {
            System.out.println("[" + (i + 1) + "]");
            p[i] = nhap();
        }
        longestDistance(p, n);
    }
}
