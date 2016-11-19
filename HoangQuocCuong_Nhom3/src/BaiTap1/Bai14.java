package BaiTap1;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.print("Các số nguyên tố nhỏ hơn " + n + " là : ");
        for (int i = 2; i <= n; i++) {
            if (primeCheck(i)) {
                System.out.printf("%4d", i);
            }
        }
        System.out.println("");
    }

    public static boolean primeCheck(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
