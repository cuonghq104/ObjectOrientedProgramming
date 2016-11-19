package BaiTap1;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Height = ");
        int h = sc.nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h - 1 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j + " ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
