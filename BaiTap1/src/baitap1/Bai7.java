package baitap1;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        double d = 0;
        while( n > 0) {
            d += (float) 1/n;
            n--;
        }
        System.out.println("Result = " + d);
    }
}
