/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.view;

import gui.*;
import gui.element.Button;
import java.util.LinkedHashMap;
import javax.swing.JPanel;

/**
 *
 * @author milan
 */
public class Edit extends JPanel {
    
    Menu menu;
    Layout layout;
    
    public Edit(Frame frame){
        menu = new Menu();
        layout = new Layout(frame);
        layout.threeGrid();
                
        addMenu();
        menu.setActive("tournament");
    }
    
    private void addMenu() {
        
        LinkedHashMap menuElements = menu.getElements();
        for(Object key : menuElements.keySet()) {
            Button button = (Button) menuElements.get(key);
            layout.getLeft().add(button);
        }
        
    }
    
}
