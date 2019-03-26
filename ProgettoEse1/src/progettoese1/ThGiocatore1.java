/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettoese1;

/**
 *
 * @author besan
 */
public class ThGiocatore1 extends Thread {

    DatiCondivisi datiC;
    private int lancioDado;

    public ThGiocatore1(DatiCondivisi datiC) {
        this.datiC= datiC;
        this.lancioDado = 0;
    }

    public int getLancioDado() {
        return lancioDado;
    }

    public void setLancioDado(int lancioDado) {
        this.lancioDado = lancioDado;
    }

    @Override
    public void run() {

        while (datiC.isFinito() == false) {
            
            datiC.lancio(1, (int) (Math.random() * 6)+1);
            if (datiC.isFinito() == false)
                datiC.lancio(1, (int) (Math.random() * 6)+1);

        }
        System.out.println("FINE TH1");
    }
}
