/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view.tournament;

import gui.Menu;
import gui.Panel;
import gui.element.Button;
import java.awt.*;
import java.util.LinkedHashMap;
import javax.swing.*;

/**
 *
 * @author milan
 */
public class Edit extends JPanel implements src.view.Edit {
    
        public Edit() {
        super();
        
        Frame frameEen = new Frame();
        Panel panelLeft = new Panel();
        Panel panelCenter = new Panel();
        Panel panelTop = new Panel();
        
        JLabel panelNaam = new JLabel("Toernooi toevoegen...");
        
        panelCenter.setPreferredSize(new Dimension(1180, 696));
        panelLeft.setPreferredSize(new Dimension(100, 696));
        panelTop.setPreferredSize(new Dimension(1280, 24));
      
        panelLeft.setBackground(new Color(50, 62, 78));
        panelTop.setBackground(Color.LIGHT_GRAY);
        
        frameEen.add(panelTop, BorderLayout.NORTH);
        frameEen.add(panelLeft, BorderLayout.WEST);
        frameEen.add(panelCenter, BorderLayout.CENTER);
        
        panelCenter.add(panelNaam);
    }
    
    public void addMenu(Menu menu){
        LinkedHashMap menuElements = menu.getElements();
        for(Object key : menuElements.keySet()) {
            Button button = (Button) menuElements.get(key);
            add(button);
        }
    }
    
}
