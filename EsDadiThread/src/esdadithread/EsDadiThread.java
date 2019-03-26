/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esdadithread;

/**
 *
 * @author besan
 */
public class EsDadiThread {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        DatiCondivisi datiC = new DatiCondivisi();
        ThGiocatore1 th1 = new ThGiocatore1(datiC);
        ThGiocatore2 th2 = new ThGiocatore2(datiC);

        th1.start();
        th2.start();

        th1.join();
        th2.join();
    }

}
