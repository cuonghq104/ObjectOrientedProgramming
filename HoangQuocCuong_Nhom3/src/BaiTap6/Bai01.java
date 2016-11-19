/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap6;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Cuong
 */

class ColorChange extends JFrame implements ItemListener{

    JComboBox<String> comboBox;
    JPanel jpScreen = new JPanel();
    JPanel jpNorth = new JPanel();
    public ColorChange() throws HeadlessException {
        setLayout(new BorderLayout());
        
        comboBox = new JComboBox();
        comboBox.addItem("RED");
        comboBox.addItem("YELLOW");
        comboBox.addItem("AMBER");
        comboBox.addItem("ORANGE");
        comboBox.addItem("GREEN");
        comboBox.addItem("BLUE");
        comboBox.addItem("BLACK");
        
        jpNorth.add(comboBox);
        add(jpScreen, BorderLayout.CENTER);
        add(jpNorth, BorderLayout.NORTH);
        
        comboBox.addItemListener(this);
        changeColor(comboBox.getItemAt(0));
    }

    public void changeColor(String select) {
        System.out.println(select);
        switch(select) {
            case "RED":
                jpScreen.setBackground(MyColor.MY_RED);
                jpNorth.setBackground(MyColor.MY_RED);
                break;
            case "YELLOW":
                jpScreen.setBackground(MyColor.MY_YELLOW);
                jpNorth.setBackground(MyColor.MY_YELLOW);
                break;
            case "AMBER":
                jpScreen.setBackground(MyColor.AMBER);
                jpNorth.setBackground(MyColor.AMBER);
                break;
            case "ORANGE":
                jpScreen.setBackground(MyColor.MY_ORANGE);
                jpNorth.setBackground(MyColor.MY_ORANGE);
                break;
            case "GREEN":
                jpScreen.setBackground(MyColor.MY_GREEN);
                jpNorth.setBackground(MyColor.MY_GREEN);
                break;
            case "BLUE":
                jpScreen.setBackground(MyColor.NEW_BLUE);
                jpNorth.setBackground(MyColor.NEW_BLUE);
                break;
            case "BLACK":
                jpScreen.setBackground(MyColor.BLACK);
                jpNorth.setBackground(MyColor.BLACK);
                break;
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String select = e.getItem().toString();
        changeColor(select);
    }
    
    
}

public class Bai01{
    public static void main(String[] args) {
        ColorChange colorChange = new ColorChange();
        colorChange.setTitle("Change color");
        colorChange.setSize(500, 500);
        colorChange.setVisible(true);
        colorChange.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
