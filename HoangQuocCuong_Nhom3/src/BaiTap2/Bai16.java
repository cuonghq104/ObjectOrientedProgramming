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
public class Bai16 {

    public static void main(String[] args) {
        MaTran mt = new MaTran();
        mt.nhap();
        System.out.println("Ma trận vừa nhập : ");
        mt.in();
        mt = deleteColumn(mt);
        System.out.println("MA TRẬN SAU KHI XÓA CỘT : ");
        mt.in();
    }

    public static MaTran deleteColumn(MaTran mt) {
        int max = 0;
        int c = -1;
        for (int i = 0; i < mt.column; i++) {
            int tmp = 0;
            for (int j = 0; j < mt.row; j++) {
                tmp += mt.a[j][i];
            }
            if (tmp > max) {
                max = tmp;
                c = i;
            }
        }
        for (int i = c; i < mt.column - 1; i++) {
            for (int j = 0; j < mt.row; j++) {
                mt.a[j][i] = mt.a[j][i + 1];
            }
        }
        mt.column--;
        return mt;
    }
}
