/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author Cuong
 */
public class Bai18 {
    public static void main(String[] args) {

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        Random r = new Random();
        
        for (int i = 0; i < 30; i++) {
            a.append(Character.toChars(r.nextInt(10) + '0'));
        }
        
        for (int i = 0; i < 15; i++) {
            b.append(Character.toChars(r.nextInt(10) + '0'));
        }
        
        BigInteger bi1 = new BigInteger(a.toString());
        BigInteger bi2 = new BigInteger(b.toString());
        
        System.out.println("A  : " + a.toString());
        System.out.println("B  : " + b.toString());
        
        // Cộng
        BigInteger add = bi1.add(bi2);
        System.out.println();
        System.out.println("ADD : " + add.toString());
        
        // Trừ
        BigInteger sub = bi1.subtract(bi2);
        System.out.println();
        System.out.println("SUBTRACT : " + sub.toString());
        
        // Nhân
        BigInteger mul = bi1.multiply(bi2);
        System.out.println();
        System.out.println("MULTIPLY : " + mul.toString());
        
        // Chia
        BigInteger div = bi1.divide(bi2);
        BigInteger mod = bi1.mod(bi2);
        System.out.println();
        System.out.println("DIVIDE : " + div.toString());
        System.out.println("MOD    : " + mod.toString());
        
        // Ước chung lớn nhất
        BigInteger gcd = bi1.gcd(bi2);
        System.out.println();
        System.out.println("GCD : " + gcd.toString());
        
        // Bội chung nhỏ nhất
        System.out.println();
        System.out.println("LCM : " + mul.divide(gcd));
        
        
    }
}
