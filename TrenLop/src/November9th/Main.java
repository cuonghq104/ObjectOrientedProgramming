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
public class Main {
    public static void main(String[] args) {
        
        ColorSwitch colorSwitch = new ColorSwitch("COLOR SWITCH");
        colorSwitch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        colorSwitch.setVisible(true);
        colorSwitch.setSize(300, 400);
        
    }
  
}
