/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sept14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Cuong
 */
public class Copy {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream in = new FileInputStream("A.xlsx");
        BufferedInputStream bis = new BufferedInputStream(in);
        FileOutputStream out = new FileOutputStream("B.xlsx");
        BufferedOutputStream bos = new BufferedOutputStream(out);
        int n = 0;
        do {
            n = bis.read();
            bos.write(n);
        } while (n != -1);
        out.close();
        bos.close();
    }
    
}
