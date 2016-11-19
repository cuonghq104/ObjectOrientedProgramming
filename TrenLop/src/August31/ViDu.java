/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package August31;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class ViDu {
    private int ma;
    private String ten;
    private int khoa;

//    public ViDu(int ma, String ten, int khoa) {
//        this.ma = ma;
//        this.ten = ten;
//        this.khoa = khoa;
//    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên : ");
        ten = sc.nextLine();
        System.out.print("Mã : ");
        ma = Integer.parseInt(sc.nextLine());
        System.out.print("Khóa : ");
        khoa = Integer.parseInt(sc.nextLine());
    }
    
    public void in() {
        System.out.printf("%10d %20s %10d\n", ma, ten, khoa);
    }
    
    public String getTen() {
        return ten;
    }
}
