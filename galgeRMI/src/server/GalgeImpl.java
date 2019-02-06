/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author alexander
 */
public class GalgeImpl extends UnicastRemoteObject implements GalgeInterf {
    
    private GalgeLogik gl = new GalgeLogik();
    
    public GalgeImpl() throws RemoteException{
        
    }

    /**
     *
     * @throws Exception
     */
    @Override
    public void startSpil() throws Exception {
        gl.hentOrdFraDr();
        gl.nulstil();
        System.out.println("der er lige blevet startet et spil");
    }

    @Override
    public String getOrd() throws java.rmi.RemoteException {
        return gl.getSynligtOrd();
    }

    @Override
    public void gætBogstav(String s) throws java.rmi.RemoteException {
        gl.gætBogstav(s);
        System.out.println("der er lige blevet gættet på et bogstav");
    }
}
