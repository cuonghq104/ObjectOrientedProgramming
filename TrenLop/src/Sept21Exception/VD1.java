/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sept21Exception;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Cuong
 */
public class VD1 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("KQ.txt"));
            while (sc.hasNextLine()) {
                try {
                    int n = Integer.parseInt(sc.nextLine());
                    System.out.println(n);
                } catch (NumberFormatException ex) {
                    System.out.println("Nhập không chuẩn định dạng");
                }
            }
//            int n = Input.readInt();
        } catch (FileNotFoundException ex) {
            System.out.println("Không tìm thấy file");
        }
    }
}
