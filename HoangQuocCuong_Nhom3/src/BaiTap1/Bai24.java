/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Cuong
 */
public class Bai24 {

    public static void main(String[] args) {
        int counter = 0;
        System.out.println("RESULT: ");
        for (int i = 1000000; i <= 9999999; i++) {
            if (digitsCheck(i) && primeCheck(i) && primeCheck(reverseNumber(i))) {
                System.out.print(i + "\t");
                counter++;
            }
            if (counter == 8) {
                System.out.println("");
                counter = 0;
            }
        }
        System.out.println();
    }

    public static boolean primeCheck(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean digitsCheck(int n) {
        while (n != 0) {
            int tmp = n % 10;
            if (tmp != 2 && tmp != 3 && tmp != 5 && tmp != 7) {
                return false;
            }
            n = n / 10;
        }
        return true;
    }

    public static int reverseNumber(int n) {
        int tmp = 0;
        while (n != 0) {
            tmp = tmp * 10 + n % 10;
            n = n / 10;
        }
        return tmp;
    }
}
