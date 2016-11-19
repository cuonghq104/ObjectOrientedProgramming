package BaiTap1;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float c, pi = 0;
        System.out.print("C = ");
        c = sc.nextFloat();
        c = (1 - c) / (2 * c);
        int n = 1 + (int) c;
        for (int i = 0; i <= n; i++) {
            pi += (float) Math.pow(-1, i) / (2 * i + 1);
        }
        pi = pi * 4;
        System.out.println("PI = " + pi);
    }

}
