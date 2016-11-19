
package BaiTap1;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.print(n+ "số nguyên tố đầu tiên là : ");
        int i = 1;
        while(n != 0) {
            if( primeCheck(i)) {
                System.out.print(i + "  ");
                n--;
            }
            i++;
        }
        
        System.out.println("");
    }
    
    public static boolean primeCheck( int n) {
        if( n < 2)
            return false;
        for( int i = 2; i <= Math.sqrt(n); i++) {
            if( n % i == 0)
                return false;
        }
        return true;
    }
}
