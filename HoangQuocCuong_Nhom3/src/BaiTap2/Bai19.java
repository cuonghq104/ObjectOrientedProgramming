/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Cuong
 */
public class Bai19 {

    public static void main(String[] args) {
        MaTran mt = new MaTran();
        mt.nhap();
        System.out.println("MA TRẬN vừa nhập : ");
        mt.in();
        MaTran mtx = matrixRotate(mt);
        System.out.println("MA TRẬN xoay một góc 90 độ ngược chiều kim đồng hồ : ");
        mtx.in();
    }

    public static MaTran matrixRotate(MaTran mt) {
        MaTran tmp = new MaTran();
        tmp.column = tmp.row = mt.column;
        for(int i = 0; i < tmp.row; i++) {
            for(int j = 0; j < tmp.column; j++) {
                tmp.a[i][j] = mt.a[j][mt.row - i - 1];
            }
        }
        return tmp;
    }
}
