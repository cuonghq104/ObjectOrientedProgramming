package baitap1;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Chiều dài = ");
        int cd = sc.nextInt();
        System.out.print("Chiều rộng = ");
        int cr = sc.nextInt();
        
        for( int i = 0; i < cr; i++) {
            if( i == 0 || i == cr - 1) {
                for( int j = 0; j < cd; j++) {
                    System.out.print("*");
                }
            }
            else {
                System.out.print("*");
                for( int j = 0; j < cd - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
