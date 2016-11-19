/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Cuong
 */
public class Bai14 {

    public static void soSanh(SoPhuc a, SoPhuc b) {
        System.out.print("So sánh : ");
        if (a.bangNhau(b)) {
            System.out.println("A và B bằng nhau");
        } else if (a.lonHon(b)) {
            System.out.println("A lớn hơn B");
        } else {
            System.out.println("A nhỏ hơn B");
        }
    }

    public static void main(String[] args) {
        SoPhuc a = new SoPhuc();
        System.out.println("Nhập số phức A : ");
        a.nhap();
        SoPhuc b = new SoPhuc();
        System.out.println("Nhập số phức B : ");
        b.nhap();
        System.out.println("Hai số phức vừa nhập : ");
        System.out.print("  A : ");
        a.hien();
        System.out.print("  B : ");
        b.hien();
        soSanh(a, b);
        System.out.print("  Số phức tổng : ");
        SoPhuc tong = a.cong(b);
        tong.hien();

        System.out.print("  Số phức hiệu : ");
        SoPhuc hieu = a.tru(b);
        hieu.hien();

        System.out.print("  Số phức tích : ");
        SoPhuc tich = a.nhan(b);
        tich.hien();

        System.out.print("Số phức thương : ");
        SoPhuc thuong = a.chia(b);
        thuong.hien();

    }
}
