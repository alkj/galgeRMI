
package server;

public interface GalgeInterf extends java.rmi.Remote{
    
    void startSpil()            throws Exception;
    String getOrd()             throws java.rmi.RemoteException;
    void gætBogstav(String s)   throws java.rmi.RemoteException;    
    
}
