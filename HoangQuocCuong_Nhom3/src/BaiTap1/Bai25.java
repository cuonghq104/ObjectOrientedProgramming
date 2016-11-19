package BaiTap1;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chiều cao = ");
        int n = sc.nextInt();
        System.out.println("Tam giác Pascal có chiều cao " + n + " : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(combination(i, j) + "\t\t");
            }
            System.out.println();
        }
    }

    public static int combination(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return combination(n - 1, k) + combination(n - 1, k - 1);
    }
}
