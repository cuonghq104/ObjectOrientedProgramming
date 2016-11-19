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
public class Test {
    public static int UCLN(int a, int b) {
         return b == 0 ? a : UCLN(b, a % b);
    }
    

    public static void main(String[] args) {
        int c = UCLN(16, 28);
        System.out.println(c + "\n" + 16 * 28 / c);
    }
}
