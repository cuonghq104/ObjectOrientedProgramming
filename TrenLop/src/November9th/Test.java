/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package November9th;

import javax.swing.JFrame;

/**
 *
 * @author Cuong
 */
public class Test {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Test");
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(300, 400);
    }
}
