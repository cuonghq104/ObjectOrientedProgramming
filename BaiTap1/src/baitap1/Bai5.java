package baitap1;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" n = ");
        int n = sc.nextInt();
        int s = 0;
        while( n > 0) {
            s += n;
            n -= 2;
        }
        System.out.println("S = " + s);
    }
}
