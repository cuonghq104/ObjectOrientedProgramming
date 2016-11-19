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
public class Bai12 {
    public static void main(String[] args) {
        int key = 0;
        Scanner sc = new Scanner(System.in);
        while(key != 4) {
            System.out.println("Nhập 1: Tính tổng và hiệu của hai ma trận");
            System.out.println("Nhập 2: Tính tích của hai ma trận");
            System.out.println("Nhập 3: Tìm ma trận chuyển vị của hai ma trận");
            System.out.println("Nhập 4: Kết thúc chương trình");
            System.out.print("==> Nhập : ");
            key = sc.nextInt();
            switch (key) {
                case 1:
                {
                    System.out.println("Ma trận A  : ");
                    System.out.print("   Số hàng : "); int r = sc.nextInt();
                    System.out.print("   Số cột  : "); int c = sc.nextInt();
                    MaTrix a = new MaTrix(r, c);
                    a.input();
                    System.out.println("Ma Trận B  : ");
                    System.out.print("   Số hàng : "); r = sc.nextInt();
                    System.out.print("   Số cột  : "); c = sc.nextInt();
                    MaTrix b = new MaTrix(r, c);
                    b.input();
                    MaTrix add = a.add(b);
                    if (add == null) {
                        System.out.println("Không tồn tại ma trận tổng và hiệu");
                    }
                    else {
                        System.out.println("Ma trận tổng : ");
                        add.print();
                        MaTrix sub = a.sub(b);
                        System.out.println("Ma trận hiệu : ");
                        sub.print();
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("Ma trận A  : ");
                    System.out.print("   Số hàng : "); int r = sc.nextInt();
                    System.out.print("   Số cột  : "); int c = sc.nextInt();
                    MaTrix a = new MaTrix(r, c);
                    a.input();
                    System.out.println("Ma Trận B  : ");
                    System.out.print("   Số hàng : "); r = sc.nextInt();
                    System.out.print("   Số cột  : "); c = sc.nextInt();
                    MaTrix b = new MaTrix(r, c);
                    b.input();
                    MaTrix mul = a.mul(b);
                    if(mul == null) {
                        System.out.println("Không tồn tại ma trận tích");
                    }
                    else {
                        System.out.println("Ma Trận tích");
                        mul.print();
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("Ma trận A  : ");
                    System.out.print("   Số hàng : "); int r = sc.nextInt();
                    System.out.print("   Số cột  : "); int c = sc.nextInt();
                    MaTrix a = new MaTrix(r, c);
                    a.input();
                    System.out.println("Ma trận chuyển vị : ");
                    MaTrix tran = a.transpose();
                    tran.print();
                }
                case 4:
                    break;
            }
        }
    }
    
}
