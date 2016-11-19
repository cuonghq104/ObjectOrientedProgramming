package BaiTap1;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */

public class Bai10
{
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.print("A = "); int a = sc.nextInt();
        System.out.print("B = "); int b = sc.nextInt();
        int gcm = gcm(a, b);
        System.out.println("UCLN = " + gcm);
        System.out.println("BCNN = " + a * b / gcm);
        
    }
    
    public static int gcm( int a, int b) {
        if( b == 0) return a;
        else
            return gcm( b, a % b);
    }
    
}
