/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import gui.Frame;

/**
 *
 * @author Jeffrey
 */
class Main {
    
    Frame window;
   
    private final static int WIDTH = 1280;
    private final static int HEIGHT = 960;
    
    public Main() {
        
        window = new Frame(WIDTH, HEIGHT);
        
        app.view.tournament.Edit tournamentEdit = new app.view.tournament.Edit(window);
        
        window.add(tournamentEdit);
        
        window.revalidate();
        window.repaint();
    }
    
}
