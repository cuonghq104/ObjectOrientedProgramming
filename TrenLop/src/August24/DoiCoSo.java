/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * And open the template in the editor.
 */

package August24;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */

public class DoiCoSo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        System.out.println(doiCoSo(n, b));
    }
    
    public static String doiCoSo(int n, int b) {
        StringBuilder kq = new StringBuilder();
        int du;
        while (n > 0) {
            du = n % b;
            n = n / b;
            if (du < 10) {
                kq.append(du);
            } else {
                kq.append((char) (du - 10 + 'A'));
            }   
        }
        kq.reverse();
        return kq.toString();
    }
}
