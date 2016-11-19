/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sept14;

import java.awt.Point;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Cuong
 */
public class VD implements Serializable{
    public static void main(String[] args) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Test.txt"));
        Point p = new Point(3, 4);
        Point q = new Point(4, 5);
        objectOutputStream.writeObject(q);
        objectOutputStream.writeObject(p);
    }
}
