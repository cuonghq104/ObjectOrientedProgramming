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
public class Bai13 {
    
    public static void soSanh(PhanSo ps1, PhanSo ps2) {
        if(ps1.bangNhau(ps2)) {
            System.out.println("Hai phân số bằng nhau");
            return;
        }
        if(ps1.lonHon(ps2)) {
            System.out.println("Phân số A lớn hơn");
            return;
        }
        System.out.println("Phân số B lớn hơn");
    }
    
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo();
        System.out.println("Phân số A : ");
        ps1.nhap();
        PhanSo ps2 = new PhanSo();
        System.out.println("Phân số B : ");
        ps2.nhap();
        System.out.print("  Tối giản phân số A   : ");
        ps1 = ps1.toiGian(); ps1.hien();
        System.out.print("  Tối giản phân số B   : ");
        ps2 = ps2.toiGian(); ps2.hien();
        
        System.out.print("  Tổng hai phân số   : "); ps1.cong(ps2).hien();
        System.out.print("  Hiệu hai phân số   : "); ps1.tru(ps2).hien();
        System.out.print("  Tích hai phân số   : "); ps1.nhan(ps2).hien();
        System.out.print("  Thương hai phân số : "); ps1.chia(ps2).hien();
        soSanh(ps1, ps2);
        
    }
    
}
