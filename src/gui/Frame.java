/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Jeffrey
 */
public class Frame extends JFrame {
    
    public Frame(int width, int height){
        super();
        
        setLayout(new BorderLayout());
        setVisible(true);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        setLocationRelativeTo(null);
        setVisible(true); 
    }
    
    @Override
    public int getWidth() {
        return super.getWidth();
    }
    
    @Override
    public int getHeight() {
        return super.getHeight();
    }
    
}
