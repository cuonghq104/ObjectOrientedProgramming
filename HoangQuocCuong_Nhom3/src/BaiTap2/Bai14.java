/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai14 {

    public static void main(String[] args) {
        MaTran mt = new MaTran();
        mt.nhap();
        System.out.println("Ma trận vừa nhập : ");
        mt.in();
        tongDuongCheo(mt);
    }

    public static void tongDuongCheo(MaTran mt) {
        int tong_cc = 0;
        int tong_cp = 0;
        for (int i = 0; i < mt.row; i++) {
            tong_cc += mt.a[i][i];
            tong_cp += mt.a[i][mt.row - i - 1];
        }
        System.out.println("Tổng đường chéo chính : " + tong_cc);
        System.out.println("Tổng đường chéo phụ   : " + tong_cp);
    }
}
