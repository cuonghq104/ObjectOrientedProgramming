package BaiTap1;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Height = ");
        int h = sc.nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
