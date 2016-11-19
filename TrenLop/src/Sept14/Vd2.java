/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sept14;

import java.awt.Point;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * 
 * @author Cuong
 */

public class Vd2{

    public static void main(String[] args) throws FileNotFoundException, IOException {
//        DataInputStream in = new DataInputStream(new FileInputStream("A.xlsx"));
//        int n = 0;
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(in.readChar());
//        }
//        

//        DataOutputStream out = new DataOutputStream(new FileOutputStream("B.txt"));
//        out.writeInt(1234);
//        out.writeDouble(5.678);
//        out.writeUTF("Xin Chao Java");
//        out.close();

//        DataInputStream in = new DataInputStream(new FileInputStream("B.txt"));
//        DataOutputStream out = new DataOutputStream(new FileOutputStream("A.txt"));
//        
//        System.out.println(in.readInt());
//        System.out.println(in.readDouble());
//        System.out.println(in.readUTF());

//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("B.txt"));
//        Point p = new Point(3, 4);
//        out.writeObject(p);
//        out.close();
        
        // !!!!!!: nếu lỗi vào object viết thêm implements Serializable
        // Viết ra file (lỗi exception ghi ra các object tự tạo) các nếu muốn bỏ qua thuộc tính nào đó thì thêm từ khóa transient
        
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("B.txt"));
        try {
            Point w = (Point)in.readObject();
            System.out.println(w.toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Vd2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
