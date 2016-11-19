/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sept14;

import java.awt.Point;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Cuong
 */
public class DocFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.txt"));
        Point p = (Point) ois.readObject();
        Point q = (Point) ois.readObject();
        System.out.println(p.toString());
        System.out.println(q.toString());
    }
}
