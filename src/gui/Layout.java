/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author Henk
 */
public class Layout extends JPanel {
    
    Frame window;
    
    JPanel leftPanel = new JPanel();
    JPanel topPanel = new JPanel();
    JPanel centerPanel = new JPanel();
    
    public Layout(Frame window) {
        this.window = window;
    }
    
    public void threeGrid(){
        
        int width = window.getWidth();
        int height = window.getHeight();
        
        window.setSize(width, height);
        window.setLayout(new BorderLayout());

        topPanel.setPreferredSize(new Dimension(width, 24));
        topPanel.setBackground(Color.LIGHT_GRAY);
        
        centerPanel.setPreferredSize(new Dimension(width - 100, height - 24));
        
        leftPanel.setPreferredSize(new Dimension(100, height));
        leftPanel.setBackground(new Color(50, 62, 78));
        
        window.add(topPanel, BorderLayout.NORTH);
        window.add(leftPanel, BorderLayout.WEST);
        window.add(centerPanel, BorderLayout.CENTER);
       
    }
    
    public JPanel getLeft(){
        return leftPanel;
    }
    
    public JPanel getTop() {
        return topPanel;
    }
    
    public JPanel getCenter() {
        return centerPanel;
    }
    
    public void get_Right() {
        System.out.println("get_Right");
    }
    
}
