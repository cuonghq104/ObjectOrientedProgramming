/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebeliever;

import java.io.PrintWriter;

/**
 *
 * @author Cuong
 */
public class Nguoi {
    
    protected String ten;
    
    protected String diaChi;
    
    protected String soDienThoai;
    
    public Nguoi() {
        ten = "";
        diaChi = "";
        soDienThoai = "";
    }
    
    public Nguoi(String ten, String diaChi, String soDienThoai) {
        this.ten = ten;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
    }

    public void in() {
        System.out.printf("%20s%10s%15s", ten, diaChi, soDienThoai);
    }
    
    public void in(PrintWriter pw) {
        pw.printf("%20s%10s%15s", ten, diaChi, soDienThoai);
    }
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    
    
}
