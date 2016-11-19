/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sept14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cuong
 */

/**
 * File nhị phân : ....Stream
 * Object : 
 *  -InputStream:
 *      -FileInputStream
 *      -FilterInputStream:
 *          -DataInputStream
 *          -BufferedInputStream
 *      -ObjectInputStream
 *  -OutputStream
 *      -FileOutputStream
 *      -FilterOutputStream
 * 
 * PrintStream
 * System.out is a PrintStream object
 * ! : Do not open a file for reading (Scanner) and writing (PrintStream) at the same time
 */

public class VD1 {
    public static void main(String[] args) throws IOException {
//        try {
//            FileInputStream in = new FileInputStream("VD.txt");
//            int n = in.read();
//            System.out.println(n);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(VD1.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
//        FileOutputStream out = new FileOutputStream("KQ.txt");
//        for(int i = 0; i < 1000; i++) {
//            out.write(i);
//        }
//        out.close();
        
        FileInputStream in = new FileInputStream("KQ.txt");
        for (int i = 0; i < 1000; i++) {
            System.out.println(in.read());
        }

        
    }
 
}
