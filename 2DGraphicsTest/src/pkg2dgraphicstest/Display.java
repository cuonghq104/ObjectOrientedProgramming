/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2dgraphicstest;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

/**
 *
 * @author Cuong
 */
public class Display {
    
    private JFrame frame;
    
    private Canvas canvas;
    
    private int width;
    private int height;
    
    private String title;
    
    private BufferedImage bf;
    
    public Display( String title, int weight, int height) {
        this.title = title;
        this.width = weight;
        this.height = height;
        
        createDisplay();
    }
    
    public void createDisplay() {
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        
        frame.add(canvas);
        frame.pack();
    }
    
    public Canvas getCanvas() {
        return canvas;
    }
}
