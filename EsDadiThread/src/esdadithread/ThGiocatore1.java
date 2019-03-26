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
public class ThGiocatore1 extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();
    private int lancioDado;

    public ThGiocatore1() {
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
        boolean finito = false;
        while (!finito) {
            lancioDado = (int) (Math.random() * 6);
            if (lancioDado == datiC.getNum()) {
                datiC.punteggioGiocatore1();
                if (datiC.getPunteggioGiocatore1() == 10) {
                    finito = true;
                }
            }
        }
    }
}
