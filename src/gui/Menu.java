/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.Map;
import gui.element.Button;
import java.util.LinkedHashMap;

/**
 *
 * @author Jeffrey
 */
public class Menu {
    
    private Map buttons = new LinkedHashMap();
    public String active;
    
    public Menu(){
      
        buttons.put("tournament", new Button("Tournament", "src/cup.png", 0, this));
        buttons.put("users", new Button("Users", "src/user.png", 0, this));
        buttons.put("registration", new Button("Registration", "src/registration.png", 0, this));
        buttons.put("options", new Button("Options", "src/options.png", 0, this));
        buttons.put("a", new Button("a", "src/user.png", 0, this));
        buttons.put("aregistration", new Button("aRegistration", "src/registration.png", 0, this));
    }
    
    public LinkedHashMap getElements(){
        return (LinkedHashMap) buttons;
    }
    
    public void setActive(String key){
        
        if(active != null && active != key) {
            Button prevActive = (Button) buttons.get(active.toLowerCase());
            prevActive.setActive(false);
        }
        
        active = key; 
        
        Button newActive = (Button) buttons.get(active.toLowerCase());
        newActive.setActive(true);
    }
    
}
