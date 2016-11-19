
package BaiTap1;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        System.out.print("Các số chính phương trong đoạn vừa nhập là : ");
        for( int i = (int)Math.sqrt(a); i <= (int)Math.sqrt(b); i++) {
            System.out.print(i * i + "  ");
        }
    }
}
