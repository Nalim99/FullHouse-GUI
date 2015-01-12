/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view.tournament;

import gui.Frame;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author milan
 */
public class Edit extends src.view.Edit {
    
    //panel voor boxLayout
    JPanel xpanel = new JPanel();
    JPanel center;
    JPanel left;
    JPanel top;
    
    // elementen
    JLabel pageName;
    JLabel nameLbl;
    JTextField nameTxt;
    JLabel descLbl;
    JTextArea descTxta;
    JLabel datLbl;
    JTextField datTxt;
    JLabel inlegLbl;
    ArrayList<Integer> varInleg;
    JComboBox inlegDrop;
    JLabel deelLbl;
    ArrayList<Integer> varDeel;
    JComboBox deelDrop;
    JButton saveBut;
    
    public Edit(Frame window) {
        
        super(window);
        
        // Layout componenten ophalen
        center = layout.getCenter();
        left = layout.getLeft();
        top = layout.getTop();
        
        // Set active
        menu.setActive("tournament");
        
        //alles aanmaken
        center.setLayout(new BorderLayout());
        xpanel.setLayout(new BoxLayout(xpanel, BoxLayout.PAGE_AXIS));
        center.add(xpanel, BorderLayout.WEST);
        xpanel.setBorder(BorderFactory.createEmptyBorder(17,17,17,17));
        
        init();
        render();
        
        center.revalidate();
        center.repaint();
        
        //Om te testen waarom glue niet werkt //reden = alles zit in 1 panel
//        xpanel.setBorder(BorderFactory.createLineBorder(new Color(50, 50, 50)));
    }
    
    private void init() {
        
        pageName = new JLabel("TOERNOOI TOEVOEGEN");
        nameLbl = new JLabel("Naam: ");
        nameTxt = new JTextField(5);
        descLbl = new JLabel("Descriptie: ");
        descTxta = new JTextArea(8, 14);
        datLbl = new JLabel("Datum: ");
        datTxt = new JTextField(5);
        inlegLbl = new JLabel("Inleg: ");
        varInleg = new ArrayList<>();
        deelLbl = new JLabel("Inleg: ");
        varDeel = new ArrayList<>();
        saveBut = new JButton("Wijzigingen opslaan");
        
        pageName.setFont(new Font("Calibri", Font.BOLD, 18));
        //datum ding gebruiken ipv 
        datLbl.setAlignmentX(LEFT_ALIGNMENT);
        for(int i = 0; i < 15; i++){
            int y = i*5;
            varInleg.add(y);
        }
        
        inlegDrop = new JComboBox(varInleg.toArray());
        inlegDrop.setSelectedIndex(8);
        
        for(int i = 0; i < 30; i++) {
            int y = i*10;
            varDeel.add(y);
        }
        
        deelDrop = new JComboBox(varDeel.toArray());
        deelDrop.setSelectedIndex(12);
 
    }
    
    private void render() {
        //alles toevoegen
        xpanel.add(pageName);
        xpanel.add(Box.createRigidArea(new Dimension(0, 50)));
        xpanel.add(nameLbl);
        xpanel.add(nameTxt);
        xpanel.add(Box.createRigidArea(new Dimension(0, 30)));
        xpanel.add(descLbl);
        xpanel.add(descTxta);
        xpanel.add(Box.createRigidArea(new Dimension(0, 30)));
        xpanel.add(datLbl);
        xpanel.add(datTxt);
        xpanel.add(Box.createRigidArea(new Dimension(0, 30)));
        xpanel.add(inlegLbl);
        xpanel.add(inlegDrop);
        xpanel.add(Box.createRigidArea(new Dimension(0, 30)));
        xpanel.add(deelLbl);
        xpanel.add(deelDrop);
        xpanel.add(Box.createRigidArea(new Dimension(0, 20)));
        xpanel.add(saveBut);
   
    }
    
    
}
