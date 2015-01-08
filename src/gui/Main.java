/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.element.Button;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Jeffrey
 */
class Main {
    Frame test = new Frame();
    Panel panelEen = new Panel();
    Panel panelTwee = new Panel();
    Panel panelDrie = new Panel();
    Menu menu = new Menu();
    
    public Main() {

        Color menuColor = new Color(50, 62, 78);
        
        JLabel panelNaam = new JLabel("Toernooi toevoegen...");
        
        panelTwee.setPreferredSize(new Dimension(300, 400));
        panelEen.setPreferredSize(new Dimension(100, 400));
        panelDrie.setPreferredSize(new Dimension(400, 24));
      
        panelEen.setBackground(menuColor);
        panelDrie.setBackground(Color.LIGHT_GRAY);
        
        addButtons();
       
        test.add(panelDrie, BorderLayout.NORTH);
        test.add(panelTwee, BorderLayout.CENTER);
        test.add(panelEen, BorderLayout.WEST);
        
        test.revalidate();
        test.repaint();
    }
    
    private void addButtons() {
        LinkedHashMap menuElements = menu.getElements();
        for(Object key : menuElements.keySet()) {
            Button button = (Button) menuElements.get(key);
            panelEen.add(button);
        }
    
    }
    
}
