/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebeliever;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class SinhVien extends Nguoi{
    private int chuyenNganh;
    
    private String lop;

    public SinhVien() {
        super();
        this.chuyenNganh = 0;
        this.lop = "";
    }

    public SinhVien(int chuyenNganh, String lop, String ten, String diaChi, String soDienThoai) {
        super(ten, diaChi, soDienThoai);
        this.chuyenNganh = chuyenNganh;
        this.lop = lop;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên : ");
        this.ten = sc.nextLine();
        System.out.print("Địa chỉ : ");
        this.diaChi = sc.nextLine();
        System.out.print("Số điện thoại : ");
        this.soDienThoai = sc.nextLine();
        System.out.print("Chuyên ngành (1.CNTT, 2.DPT, 3.DTTT) : ");
        this.chuyenNganh = Integer.parseInt(sc.nextLine());
        System.out.print("Lớp : ");
        this.lop = sc.nextLine();
    }
    
    public void nhap(Scanner sc) {
        this.ten = sc.nextLine();
        this.diaChi = sc.nextLine();
        this.soDienThoai = sc.nextLine();
        this.chuyenNganh = Integer.parseInt(sc.nextLine());
        this.lop = sc.nextLine();
    }
    
    public void in() {
        super.in();
        String cn = "";
        if (chuyenNganh == 1) {
            cn = "CNTT";
        } else if (chuyenNganh == 2) {
            cn = "DPT";
        } else {
            cn = "DTTT";
        }
        System.out.printf("%8s", cn);
        System.out.printf("%8s", lop);
        System.out.println("");
    }
    
    public void in(PrintWriter pw) {
        super.in(pw);
        String cn = "";
        if (chuyenNganh == 1) {
            cn = "CNTT";
        } else if (chuyenNganh == 2) {
            cn = "DPT";
        } else {
            cn = "DTTT";
        }
        pw.printf("%8s", cn);
        pw.printf("%8s", lop);
        pw.println("");
    }
    
}
