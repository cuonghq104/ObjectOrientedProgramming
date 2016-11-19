
package baitap1;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */

public class Bai15 {
    
    public static boolean PrimeCheck( int n) {
        if( n < 2)
            return false;
        for( int i = 2; i <= Math.sqrt(n); i++) {
            if( n % i == 0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int i = 1;
        System.out.print(n + " số nguyên tố đầu tiên là : ");
        while( n != 0 ) {
            if( PrimeCheck(i)) {
                System.out.printf("%4d", i);
                n--;
            }
            i++;
        }
        System.out.println();
    }
}
