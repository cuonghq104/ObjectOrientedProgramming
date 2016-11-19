/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package November9th;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
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
public class ColorSwitch extends JFrame implements ActionListener, ItemListener{

    JButton jButton = new JButton("OK");
    JComboBox chon = new JComboBox();
    JPanel p = new JPanel();
    JPanel ps;
    
    public ColorSwitch(String title) throws HeadlessException {
        super(title);
        setLayout(new BorderLayout());
        add(p, BorderLayout.CENTER);
        ps = new JPanel();
       
        chon.addItem("GREEN");
        chon.addItem("BLUE");
        chon.addItem("MAGENTA");
        chon.addItem("BLACK");
        
        ps.setLayout(new FlowLayout());
        ps.add(jButton);
        ps.add(chon);
        add(ps, BorderLayout.SOUTH);
        jButton.addActionListener(this);
        chon.addItemListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (chon.getSelectedIndex()) {
            case 0:
                p.setBackground(Color.GREEN);
                ps.setBackground(Color.GREEN);
                break;
            case 1:
                p.setBackground(Color.BLUE);
                ps.setBackground(Color.BLUE);
                break;
            case 2:
                p.setBackground(Color.MAGENTA);
                ps.setBackground(Color.MAGENTA);
                break;
            case 3:
                p.setBackground(Color.BLACK);
                ps.setBackground(Color.BLACK);
                break;
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String string = e.getItem().toString();
        switch (string) {
            case "GREEN":
                p.setBackground(Color.GREEN);
                ps.setBackground(Color.GREEN);
                break;
            case "BLUE":
                p.setBackground(Color.BLUE);
                ps.setBackground(Color.BLUE);
                break;
            case "MAGENTA":
                p.setBackground(Color.MAGENTA);
                ps.setBackground(Color.MAGENTA);
                break;
            case "BLACK":
                p.setBackground(Color.BLACK);
                ps.setBackground(Color.BLACK);
                break;
        }
    }
    
    
    
}
