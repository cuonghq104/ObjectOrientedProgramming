/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package November9th;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Cuong
 */
public class MyFrame extends JFrame{

    public MyFrame() {
    }

    public MyFrame(String title) throws HeadlessException {
        super(title);
        setLayout(new GridLayout(1, 2));
        add(new JTextField("Time to be displayed here"));
        JPanel p = new JPanel();
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3));
        p.add(new JTextField("Text to be displayed here"));
        p1.add(new JButton("1"));
        p1.add(new JButton("2"));
        p1.add(new JButton("3"));
        p1.add(new JButton("4"));
        p1.add(new JButton("5"));
        p1.add(new JButton("6"));
        p1.add(new JButton("7"));
        p1.add(new JButton("8"));
        p1.add(new JButton("9"));
        p1.add(new JButton("10"));
        p1.add(new JButton("11"));
        p1.add(new JButton("12"));
        
        p.add(p1);
        add(p);
    }
    
    
}
