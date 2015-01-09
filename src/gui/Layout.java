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
    
    public JPanel leftPanel = new JPanel();
    public JPanel topPanel = new JPanel();
    public JPanel centerPanel = new JPanel();
    
    public Layout(Frame window) {
        this.window = window;
    }
    
    public void threeGrid(int width, int height){
        
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
    
}
