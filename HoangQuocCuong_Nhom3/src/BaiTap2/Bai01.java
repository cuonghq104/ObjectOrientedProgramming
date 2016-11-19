
package BaiTap2;

import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        int a[] = new int[100];
        for( int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        int l = 0, r = n - 1;
        while( l < r && a[l] == a[r]) {
            l++;
            r--;
        }
        if( l < r) {
            System.out.println("Mảng không đối xứng");
        } else {
            System.out.println("Mảng đối xứng");
        }
    }
}
