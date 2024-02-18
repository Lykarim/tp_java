package com.maframe;

import javax.swing.JFrame;
public class fenetre {
    public static void main(String[] args){
        JFrame fenetre =new JFrame();
        fenetre.setTitle("Ma première fenêtre Java");
        fenetre.setSize(500, 500);
     
        fenetre.setLocationRelativeTo(null);
        
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
       fenetre.setVisible(true);
       fenetre.setLocation(500, 50);
       fenetre.setAlwaysOnTop(true) ;
       
       
    }

  
}
