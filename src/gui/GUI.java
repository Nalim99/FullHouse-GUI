/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.*;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Jeffrey
 */
public class GUI {
    
    
    static JButton knopEen = new JButton("text", new ImageIcon("src/cup.png"));
    static JButton knopTwee = new JButton("gebruikers", new ImageIcon("src/user.png"));
    static JButton knopDrie = new JButton("registratione", new ImageIcon("src/registration.png"));
    static JButton knopVier = new JButton("Opties", new ImageIcon("src/options.png"));
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Color donkererer = new Color(50, 62, 78);
        
        Frame test = new Frame();
        Panel panelEen = new Panel();
        Panel panelTwee = new Panel();
        Panel panelDrie = new Panel();
        
        JLabel panelNaam = new JLabel("Toernooi toevoegen...");
        
        panelTwee.setPreferredSize(new Dimension(300, 400));
        panelEen.setPreferredSize(new Dimension(100, 400));
        panelDrie.setPreferredSize(new Dimension(400, 24));
      
        panelEen.setBackground(donkererer);
        panelDrie.setBackground(Color.LIGHT_GRAY);
        
        panelEen.add(Box.createRigidArea(new Dimension(0,0)));
        
        styleButton(knopEen);
        styleButton(knopTwee);
        styleButton(knopDrie);
        styleButton(knopVier);
        
        addButtons(panelEen);
        
        test.add(panelDrie, BorderLayout.NORTH);
        test.add(panelTwee, BorderLayout.CENTER);
        test.add(panelEen, BorderLayout.WEST);
        
        panelTwee.add(panelNaam);
    }
    
    private static void addButtons(Panel panel){
        panel.add(knopEen);
        panel.add(knopTwee);
        panel.add(knopDrie);
        panel.add(knopVier);
    
    }
    
    private static void styleButton(JButton button) {
       
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);
        button.setOpaque(false);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        addListener(button);
        
        // Styling
        Color lightGrey = new Color(105, 105, 105);
        
        button.setForeground(Color.WHITE);
        button.setFont(new java.awt.Font("Calibri", Font.BOLD, 14));
        button.setPreferredSize(new Dimension(180, 80));
    }
    
    private static void addListener(JButton button){
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setOpaque(true);
                button.setBackground(new Color(61, 76, 96));
            }
            
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setOpaque(false);
                button.setBackground(null);
            }
        });
    }
    
}
