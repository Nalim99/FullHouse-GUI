/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import app.view.tournament.*;

/**
 *
 * @author Jeffrey
 */
class Main {
    Frame window = new Frame();
    Edit tournamentEdit = new Edit();
    Menu menu = new Menu();
    private Object Layout;
    
    public Main() {
        
//        tournamentEdit.addMenu(menu);
        window.add(tournamentEdit);
        
        window.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
//        window.setUndecorated(false);
        window.setSize(1280, 960);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setResizable(true);
//        window.add(Layout.threeGrid(1280, 960));
        
        window.revalidate();
        window.repaint();
    }
    
}
