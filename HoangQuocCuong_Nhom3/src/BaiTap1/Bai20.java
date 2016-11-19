package BaiTap1;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c, x, kq = 1, i = 1, gt = 1, y;
        System.out.print("C = ");
        c = sc.nextDouble();
        System.out.print("X = ");
        x = sc.nextDouble();
        y = x;
        while (Math.abs(x / gt) > c) {
            kq += (double) x / gt;
            i += 1;
            gt = gt * i;
            x *= y;
        }
        System.out.println("e^" + y + " = " + kq);

    }

}
