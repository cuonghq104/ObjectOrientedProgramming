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
public class Bai18 {
    public static void main(String[] args) {
        MaTran mt = new MaTran();
        mt.nhap();
        System.out.println("Ma trận vừa nhập : ");
        mt.in();
        for (int i = 0; i < mt.row; i++) {
            for (int j = 0; j < mt.column; j++) {
                for (int k = i + 1; k < mt.row; k++) {
                    for (int h = j + 1; h < mt.column; h++) {
                        if (mt.a[i][j] > mt.a[h][k]) {
                            int tmp = mt.a[i][j];
                            mt.a[i][j] = mt.a[h][k];
                            mt.a[h][k] = tmp;
                        }
                    }
                }
            }
        }
        System.out.println("Các giá trị được in ra theo thứ tự tăng dần từ trái qua phải, từ trên xuống dưới : ");
        mt.in();
    }
}
