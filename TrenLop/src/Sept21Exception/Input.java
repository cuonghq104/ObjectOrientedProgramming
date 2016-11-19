/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sept21Exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Input {

    public static int readInt() {
        boolean kt = true;
        int n = 0;
        Scanner in = new Scanner(System.in);
        while (kt) {
            try {
                String s = in.nextLine();
                char c = s.charAt(0);
                n = Integer.parseInt(s);
                if (n < 0 || n > 10) throw new SonException();
                System.out.println(n);
                kt = false;
            } catch (NumberFormatException exception) {
                System.out.println("Có lỗi : " + exception.toString());
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Chưa nhập");
            } catch (SonException e) {
                System.out.println("Phải nhập từ 0 đến 10");
            } finally {
                System.out.println("FINALITYYYY");

            }
        }
        return n;
    }
}
