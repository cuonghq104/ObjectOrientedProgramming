
package BaiTap1;

/**
 *
 * @author Cuong
 */
public class Bai21 {
    public static void main(String[] args) {
        int counter = 0;
        System.out.println("Result : ");
        for( int i = 100000; i <= 999999; i++) {
            if( sumOfAllDigits(i) % 10 == 0 && reverseNumberCheck(i)) {
                System.out.print(i + "\t");
                counter++;
            }
            if( counter == 6) {
            System.out.println("");
            counter = 0;
        }
        }
        
    }
    
    public static int sumOfAllDigits( int n) {
        int temp = 0;
        while ( n > 0) 
        {
            temp += (n % 10);
            n = n / 10;
        }
        return temp;
        
    }
    
    public static boolean reverseNumberCheck( int n) {
        int r = 0, tmp = n;
        while( tmp > 0) {
            r = r * 10 + tmp % 10;
            tmp = tmp / 10;
        }
        if( r == n)
            return true;
        return false;
    }
}
