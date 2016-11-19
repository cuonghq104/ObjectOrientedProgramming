/*
 * 
 * List all of prime number which have 6 digits and all of them are odd number.
 * 
 */

package BaiTap1;

/**
 *
 * @author Cuong
 */
public class Bai22 {
    public static void main(String[] args) {
        int counter = 0;
        System.out.println("Result : ");
        for( int i = 100000; i <= 999999; i++) {
            if( oddDigitsCheck(i) && primeCheck(i)) {
                System.out.print(i + "\t");
                counter++;
            }
            if(counter == 6) {
                counter = 0;
                System.out.println("");
            }
        }
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
    
    public static boolean oddDigitsCheck( int n) {
        while( n > 0 ) {
            int tmp = n % 10;
            if( tmp % 2 == 0)
                return false;
            n = n / 10;
        }
        return true;
    }
    
}
