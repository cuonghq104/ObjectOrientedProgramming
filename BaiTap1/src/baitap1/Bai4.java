package baitap1;

/**
 *
 * @author Cuong
 */

public class Bai4 {
    public static void main(String[] args) {
        for( int i = 1; i <= 9; i++) {
            for( int j = 2; j <= 5; j++) {
                System.out.print(j + " x " + i + " = " + i*j);
                System.out.print("\t\t");
            }
            System.out.println("");
        }
        
        System.out.println("\n");
        for( int i = 1; i <= 9; i++) {
            for( int j = 6; j <= 9; j++) {
                System.out.print(j + " x " + i + " = " + i*j);
                System.out.print("\t\t");
            }
            System.out.println("");
        }
    }
}
