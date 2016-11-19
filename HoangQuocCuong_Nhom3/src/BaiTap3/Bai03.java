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
public class Bai03 {
    public static void nhap(Rectangle r) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chiều rộng : ");
        double width = sc.nextDouble();
        System.out.print("Chiều cao  : ");
        double height = sc.nextDouble();
        System.out.print("Màu sắc  : ");
        String color = sc.next();
        r.setWidth(width);
        r.setHeight(height);
        r.setColor(color);
    }
    
    public static void in(Rectangle r) {
        System.out.println("\tChiều rộng : " + r.getWidth());
        System.out.println("\tChiều cao  : " + r.getHeight());
        System.out.println("\tMàu sắc    : " + r.getColor());
        System.out.println("\tDiện tích  : " + r.findArea());
        System.out.println("\tChu vi     : " + r.findPerimeter());
    }
    
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println("Nhập vào một hình chữ nhật : ");
        nhap(r);
        System.out.println("\nThông tin về hình chữ nhật vừa nhập : ");
        in(r);
    }
}
