package BaiTap1;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        int counter = 0;
        for (int i = a; i < b; i++) {
            for (int j = i + 1; j < b; j++) {
                if (gcm(i, j) == 1) {
                    System.out.print(i + " & " + j + "\t\t");
                    counter++;
                }
                if (counter == 8) {
                    System.out.println("");
                    counter = 0;
                }
            }
        }
        System.out.println("");
    }

    public static int gcm(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcm(b, a % b);
        }
    }
}
