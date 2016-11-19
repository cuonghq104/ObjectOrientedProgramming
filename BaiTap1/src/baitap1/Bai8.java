package baitap1;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int counter = 0;
        System.out.print("Các ước số = ");
        for( int i = 1; i < n; i++) {
            if( n % i == 0) {
                System.out.print(i + " , ");
                counter++;
            }
        }
        System.out.println(n);
        System.out.println("Số các ước số = " + ++counter);
    }
}
