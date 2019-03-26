/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettoese1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author breviario.giovanni
 */
public class ProgettoEse1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
            // TODO code application logic here
            DatiCondivisi datiC = new DatiCondivisi();
            ThGiocatore1 th1 = new ThGiocatore1(datiC);
            ThGiocatore2 th2 = new ThGiocatore2(datiC);
            
            datiC.setNum((int) (Math.random() * 6)+1);
            
            th1.start();
            th2.start();
            
            th1.join();
            th2.join();
            
            System.out.println("FINE MAIN");
        } catch (InterruptedException ex) {
            Logger.getLogger(ProgettoEse1.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
    
}
