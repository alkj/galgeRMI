
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galge;

import server.GalgeImpl;
import server.GalgeInterf;
import server.GalgeLogik;
import java.awt.event.KeyListener;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import javax.swing.*;


/**
 *
 * @author alexander
 */
public class Galge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                View v = new View();
                v.setVisible(true);
            }
        });
           
           
           
    }
    
}

