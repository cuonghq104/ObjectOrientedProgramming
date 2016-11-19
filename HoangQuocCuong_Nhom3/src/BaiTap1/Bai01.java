package BaiTap1;

import java.util.Scanner;

/**
 *
 * 
 * @author Cuong
 */ 
public class Bai01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Height = ");
        int cd = sc.nextInt();
        System.out.print("Width = ");
        int cr = sc.nextInt();

        for (int i = 0; i < cr; i++) {
            for (int j = 0; j < cd; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
