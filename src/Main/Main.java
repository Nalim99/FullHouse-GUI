/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import gui.Frame;
import gui.Menu;

/**
 *
 * @author Jeffrey
 */
class Main {
    
    Frame window = new Frame();
    Menu menu = new Menu();
    
    public Main() {
        
        window = new Frame();
        app.view.tournament.Edit tournamentEdit = new app.view.tournament.Edit(window);
        
        window.add(tournamentEdit);
    
    }
    
}
