/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Cuong
 */
public class Bai21 {

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 100000; i <= 999999; i++) {
            if (reverseNumberCheck(i)) {
                System.out.print(i + "\t");
                counter++;
            }
            if (counter == 8) {
                System.out.println();
                counter = 0;
            }
        }
    }

    public static boolean reverseNumberCheck(int i) {
        String s = Integer.toString(i);
        StringBuilder r = new StringBuilder(s);
        r.reverse();
        if (s.equals(r.toString())) {
            return true;
        }
        return false;
    }
}
