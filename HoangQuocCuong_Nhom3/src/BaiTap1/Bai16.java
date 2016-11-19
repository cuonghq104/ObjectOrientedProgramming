package BaiTap1;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fibo0 = 0, fibo1 = 1;
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.print(n + " số fibonacci đầu tiên là : ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo1 + "  ");
            int tmp = fibo0;
            fibo0 = fibo1;
            fibo1 = fibo0 + tmp;
        }
    }
}
