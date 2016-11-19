package BaiTap1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in);
        System.out.print(" N = ");
        int n = sc.nextInt();
        Random r = new Random();
        int k = n - 1;
        int counter = 0;
        while( k != n) {
            k = r.nextInt(89) + 10;
            counter++;
            System.out.println(" Random " + counter + " time(s) : " + k);
        }
        System.out.println("Final counter = " + counter);
    }
}
