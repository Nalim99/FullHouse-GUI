/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.view;

import gui.Frame;
import gui.Layout;
import gui.Menu;
import gui.element.Button;
import java.util.LinkedHashMap;
import javax.swing.JPanel;

/**
 *
 * @author milan
 */
public class Overview extends JPanel{
    
    public Menu menu;
    public Layout layout;
    
    public Overview(Frame frame){
        menu = new Menu();
        layout = new Layout(frame);
        layout.threeGrid();
                
        addMenu();
    }
    
    private void addMenu() {
        
        LinkedHashMap menuElements = menu.getElements();
        for(Object key : menuElements.keySet()) {
            Button button = (Button) menuElements.get(key);
            layout.getLeft().add(button);
        }
        
    }
   
}
