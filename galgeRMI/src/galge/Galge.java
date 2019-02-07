
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galge;


/**
 * Spørgsmål fra undervisningen.
 * Spørgsmål 1: Ender saldoen stadig på det forventede ?
 *      nej. det virker som om at der bliver lavet beregninger sammentidigt, 
 *      med at forespørgslerne kommer. så hvis de kommer oven i hinanden, så bliver det rodet.
 * 
 * Spørgsmål 2: Gør det nogen forskel hvor ventetiden (Thread.sleep(500)) står ?
 *      ja. det gør en stor forskel. man kunne sikre sig at serveren bliver færdig med en klient,
 *      før den starter med den næste.
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

