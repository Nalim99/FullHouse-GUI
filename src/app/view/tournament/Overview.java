/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view.tournament;

import gui.Menu;
import gui.element.Button;
import java.util.LinkedHashMap;
import javax.swing.*;

/**
 *
 * @author milan
 */
public class Overview extends JPanel implements src.view.Overview {
   
    public Overview() {
        super();
        
    }
    
    public void addMenu(Menu menu){
        LinkedHashMap menuElements = menu.getElements();
        for(Object key : menuElements.keySet()) {
            Button button = (Button) menuElements.get(key);
            add(button);
        }
    }
    
}
