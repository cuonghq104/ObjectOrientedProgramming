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
public class Bai01 {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.nhap();
        System.out.println("Thông tin của sinh viên vừa nhập : ");
        System.out.printf("%20s %10s %10s %10s\n", "Họ tên", "ID", "Khóa", "Lớp");
        sv.in();
    }
}
