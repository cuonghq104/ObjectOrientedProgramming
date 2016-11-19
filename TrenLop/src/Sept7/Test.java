/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sept7;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Cuong
 */
public class Test {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("sn.txt"));
        File file = new File("KQ.txt");
        PrintWriter pw = new PrintWriter(new File("KQ.txt"));
        for (int i = 0; i < 1000000; i++) {
            pw.print("a");
            ;
        }
        pw.close();
// File văn bản
/**
 *
 *
 */
// File nhị phân
    }
}