/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class PhanSo {

    private int ts;

    private int ms;

    public PhanSo() {
        ts = 0;
        ms = 1;
    }

    public PhanSo(int ts, int ms) {
        this.ts = ts;
        this.ms = ms;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tử số  = ");
        ts = sc.nextInt();
        System.out.print("Mẫu số = ");
        ms = sc.nextInt();
    }
    
    public void hien() {
        System.out.println(ts + "/" + ms);
    }
    
    public PhanSo cong(PhanSo ps2) {
        int m = (ps2.ms * this.ms) / gcm(ps2.ms, this.ms);
        int t = this.ts * (m / ps2.ms) + ps2.ts * (m / this.ms);
        
        PhanSo cong = new PhanSo(t, m);
        return cong.toiGian();
    }
    
    public PhanSo tru(PhanSo ps2) {
        int m = (ps2.ms * this.ms) / gcm(ps2.ms, this.ms);
        int t = this.ts * (m / this.ms) - ps2.ts * (m / ps2.ms);
        
        PhanSo tru = new PhanSo(t, m);
        return tru.toiGian();
    }
    
    public PhanSo nhan(PhanSo ps2) {
        int t = this.ts * ps2.ts;
        int m = this.ms * ps2.ms;
        
        PhanSo nhan = new PhanSo(t, m);
        return nhan.toiGian();
    }
    
    public PhanSo chia(PhanSo ps2) {
        int t = this.ts * ps2.ms;
        int m = this.ms * ps2.ts;
        
        PhanSo chia = new PhanSo(t, m);
        return chia.toiGian();
    }
    
    public PhanSo nghichDao() {
        int t = this.ms;
        int m = this.ts;
        
        PhanSo nghichDao = new PhanSo(t, m);
        return nghichDao;
    }
    
    public PhanSo doiDau() {
        int t = -this.ts;
        int m = -this.ms;
        
        PhanSo doiDau = new PhanSo(t, m);
        return doiDau;
    }
    
    public PhanSo toiGian() {
        int u = gcm(this.ts, this.ms);
        int t = this.ts / u;
        int m = this.ms / u;
        if(m < 0) {
            t = t / -1;
            m = m / -1;
        }
        PhanSo toiGian = new PhanSo(t, m);
        return toiGian;
    }
    
    public boolean bangNhau(PhanSo ps2) {
        if(this.ts * ps2.ms == ps2.ts * this.ms)
            return true;
        return false;
    }
    
    public boolean lonHon(PhanSo ps2) {
        if(this.ts * ps2.ms > ps2.ts * this.ms)
            return true;
        return false;
    }
    
    public boolean nhoHon(PhanSo ps2) {
        if(this.ts * ps2.ms < ps2.ts * this.ms)
            return true;
        return false;
    }
    
    public int gcm( int a, int b) {
        if( b == 0) return a;
        else
            return gcm( b, a % b);
    }
    
}
