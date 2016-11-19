
package BaiTap1;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.println("Tổng chữ số của " + n + " = " + sum_of_digits(n));
    }
    
    public static int sum_of_digits( int n) {
        int s = 0;
        while( n != 0) {
            s += (n % 10);
            n = n / 10;
        }
        return s;
    }
}
