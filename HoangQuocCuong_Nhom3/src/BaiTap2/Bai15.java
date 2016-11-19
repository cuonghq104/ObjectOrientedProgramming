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
public class Bai15 {
    public static void main(String[] args) {
        MaTran mt = new MaTran();
        mt.nhap();
        System.out.println("Ma trận vừa nhập : ");
        mt.in();
        deleteRow(mt);
    }
    
    public static void deleteRow(MaTran mt) {
        int max = 0;
        int rMax = -1;
        for(int i = 0; i < mt.row; i++) {
            int sum = 0;
            for(int j = 0; j < mt.column; j++) {
                sum += mt.a[i][j];
            }
            if(sum > max) {
                max = sum;
                rMax = i;
            }
        }
        
        for(int i = rMax; i < mt.row - 1; i++) {
            mt.a[i] = mt.a[i + 1];
        }
        mt.row--;
        System.out.println("MA TRẬN VỪA ĐƯỢC XÓA 1 HÀNG : ");
        mt.in();
    }
}
