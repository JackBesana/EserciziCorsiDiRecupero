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
public class ThGiocatore2 extends Thread {

    DatiCondivisi datiC;
    private int lancioDado;

    public ThGiocatore2(DatiCondivisi datiC) {
        this.datiC = datiC;
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
        while (!datiC.isFinito()) {
                        
            datiC.lancio(2, (int) (Math.random() * 6)+1);
            if (!datiC.isFinito())
                datiC.lancio(2, (int) (Math.random() * 6)+1);

        }
        System.out.println("FINE TH2");

    }

}
