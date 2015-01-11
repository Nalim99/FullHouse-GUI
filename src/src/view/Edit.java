/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.view;

import gui.*;
import gui.element.Button;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.util.LinkedHashMap;
import javax.swing.*;

/**
 *
 * @author milan
 */
public class Edit extends JPanel {
    
    Menu menu;
    Layout layout;
    //panel voor boxLayout
    JPanel xpanel = new JPanel();
    
    public Edit(Frame frame){
        menu = new Menu();
        layout = new Layout(frame);
        layout.threeGrid();
                
        addMenu();
        menu.setActive("tournament");
        
        //ALLES voor detailpagina (Edit) van Tournament GUI
        xpanel.setLayout(new BoxLayout(xpanel, BoxLayout.PAGE_AXIS));
        
        layout.getCenter().add(xpanel);
        
        JLabel pageName = new JLabel("Toernooi toevoegen...\n");
        pageName.setFont(new Font("Calibri", Font.BOLD, 18));
        xpanel.add(pageName);
        pageName.setAlignmentX(Component.LEFT_ALIGNMENT);
        //Toevoegen van lege ruimte tussen 2 componenten
        //Voegt het toe aan rechterkant (bij standaard leesrichting)
//        xpanel.add(Box.createRigidArea(new Dimension(50, 50)));
        JLabel nameLbl = new JLabel("Naam: ");
        xpanel.add(nameLbl);
        JTextField nameTxt = new JTextField(5);
        xpanel.add(nameTxt);
        
        JLabel descLbl = new JLabel("Descriptie: ");
        xpanel.add(descLbl);
        JTextArea descTxta = new JTextArea(8, 14);
        xpanel.add(descTxta);
        
        //Nog nieuwe panels nodig voor datum
        //datum over line as ipv page, zodat datum comboboxes goed zitten
        JLabel datLbl = new JLabel("Datum: ");
        xpanel.add(datLbl);
        JTextField datTxt = new JTextField(5);
        xpanel.add(datTxt);
        
        JLabel inlegLbl = new JLabel("Inleg: ");
        xpanel.add(inlegLbl);
        String[] varInleg = { "10","20","30","40","50","60","70","80" };
        JComboBox inlegDrop = new JComboBox(varInleg);
        inlegDrop.setSelectedIndex(3);
        xpanel.add(inlegDrop);
        
        JLabel deelLbl = new JLabel("Inleg: ");
        xpanel.add(deelLbl);
        String[] varDeel = { "10","20","30","40","50","60","70","80","90","100","110","120" };
        JComboBox deelDrop = new JComboBox(varDeel);
        deelDrop.setSelectedIndex(7);
        xpanel.add(deelDrop);
        
        JButton saveBut = new JButton("Save changes");
        xpanel.add(saveBut);
        
        //Om te testen waarom glue niet werkt //reden = alles zit in 1 panel
//        xpanel.setBorder(BorderFactory.createLineBorder(new Color(50, 50, 50)));
    }
    
    private void addMenu() {
        
        LinkedHashMap menuElements = menu.getElements();
        for(Object key : menuElements.keySet()) {
            Button button = (Button) menuElements.get(key);
            layout.getLeft().add(button);
        }
        
    }
    
}
