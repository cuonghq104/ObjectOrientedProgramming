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
public class Bai12 {

    public static void main(String[] args) {
        MaTran a = new MaTran();
        MaTran b = new MaTran();
        System.out.println("Ma trận A : ");
        a.nhap();
        System.out.println("Ma trận B : ");
        b.nhap();
        System.out.println("HAI ma trận vừa nhập : ");
        System.out.println("MA TRẬN A : ");
        a.in();
        System.out.println("MA TRẬN B : ");
        b.in();
        if (a.column != b.row) {
            System.out.println("KHÔNG tồn tại phép nhân hai ma trận");
        } else {
            MaTran c = multiplyMatrix(a, b);
            System.out.println("MA TRẬN TÍCH : ");
            c.in();
        }
    }
    
    public static MaTran multiplyMatrix( MaTran a, MaTran b) {
        MaTran c = new MaTran();
        c.row = a.row;
        c.column = b.column;
        for( int i = 0; i < c.row; i++) {
            for( int j = 0; j < c.column; j++) {
                int tmp = 0;
                for( int k = 0; k < a.column; k++) {
                    tmp =  tmp + a.a[i][k] * b.a[k][j];
                }
                c.a[i][j] = tmp;
            }
        }
        return c;
    }
}
