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
public class Bai11 {

    public static void main(String[] args) {
        MaTran mt = new MaTran();
        mt.nhap();
        System.out.println("Ma trận vừa nhập : ");
        mt.in();

        MaTran mtcv = new MaTran();
        mtcv.row = mt.column;
        mtcv.column = mt.row;
        for (int i = 0; i < mt.column; i++) {
            for (int j = 0; j < mt.row; j++) {
                mtcv.a[i][j] = mt.a[j][i];
            }
        }
        System.out.println("Ma trận chuyển vị : ");
        mtcv.in();
    }
}
