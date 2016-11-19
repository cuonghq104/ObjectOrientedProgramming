/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Cuong
 */
public class Bai23 {
    public static void main(String[] args) {
        int counter = 0;
        System.out.println("RESULT: ");
        for( int i = 1000000; i <= 999999999; i++) {
            if( sumOfAllDigits(i) % 10 == 0 && digitsCheck(i) && reverseNumberCheck(i)) {
                System.out.printf("%12d", i);
                counter++;
            }
            if( counter == 5) {
                System.out.println();
                counter = 0;
            }
        }
        System.out.println();
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
    
    public static boolean digitsCheck( int n) {
        while( n > 0) {
            int tmp = n % 10;
            if( tmp != 6 && tmp != 8 && tmp != 0) {
                return false;
            }
            n = n / 10;
        }
        return true;
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
}
