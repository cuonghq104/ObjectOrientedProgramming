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
public class SoPhuc {
    private float a;
    
    private float b;
    
    public SoPhuc() {
        a = 0;
        b = 0;
    }
    
    public SoPhuc(float a, float b) {
        this.a = a;
        this.b = b;
    }
    
    public SoPhuc cong(SoPhuc sp2) {
        SoPhuc cong = new SoPhuc();
        cong.a = this.a + sp2.a;
        cong.b = this.b + sp2.b;
        return cong;
    }
    
    public SoPhuc tru(SoPhuc sp2) {
        SoPhuc tru = new SoPhuc();
        tru.a = this.a - sp2.a;
        tru.b = this.b - sp2.b;
        return tru;
    }
    
    public SoPhuc nhan(SoPhuc sp2) {
        SoPhuc nhan = new SoPhuc();
        nhan.a = this.a * sp2.a - this.b * sp2.b;
        nhan.b = this.a * sp2.b + this.b * sp2.a;
        return nhan;
    }
    
    
    public SoPhuc chia(SoPhuc sp2) {
        float module = (sp2.a * sp2.a) + (sp2.b * sp2.b);
        // Tao so phuc lien hop cua sp2
        SoPhuc sp2_integrate = new SoPhuc(sp2.a, -sp2.b);
        SoPhuc tmp = this.nhan(sp2_integrate);
        SoPhuc chia = new SoPhuc(tmp.a / module, tmp.b / module);
        return chia;
    }
    
    public SoPhuc nghichDao() {
        SoPhuc nghichDao = new SoPhuc(this.a, -this.b);
        return nghichDao;
    }
    
    public boolean bangNhau(SoPhuc sp2) {
        if(sp2.a == this.a && sp2.b == this.b) {
            return true;
        }
        return false;
    }
    
    public boolean lonHon(SoPhuc sp2) {
        if(this.a > sp2.a) {
            return true;
        }
        if(this.a == sp2.a && this.b > sp2.b) {
            return true;
        }
        return false;
    }
    
    public boolean nhoHon(SoPhuc sp2) {
        if(this.a < sp2.a) {
            return true;
        }
        if(this.a == sp2.a && this.b < sp2.b) {
            return true;
        }
        return false;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Phần thực : ");
        this.a = sc.nextFloat();
        System.out.print("Phần ảo   : ");
        this.b = sc.nextFloat();
    }
    
    public void hien() {
        System.out.println(this.a + " + " + this.b + "i");
    }
}
