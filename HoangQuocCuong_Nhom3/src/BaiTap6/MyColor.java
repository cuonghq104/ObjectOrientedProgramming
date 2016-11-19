/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap6;

import java.awt.Color;

/**
 *
 * @author Cuong
 */
public class MyColor extends Color {

    public MyColor(int r, int g, int b) {
        super(r, g, b);
    }

    public static final MyColor AMBER = new MyColor(255, 202, 40);

    public static final MyColor MY_ORANGE = new MyColor(255, 183, 77);

    public static final MyColor NEW_BLUE = new MyColor(66, 165, 245);
    
    public static final MyColor MY_GREEN = new MyColor(102,187,106);
    
    public static final MyColor MY_RED = new MyColor(239,83,80);
    
    public static final MyColor MY_YELLOW = new MyColor(255,238,88);
    
    
}
