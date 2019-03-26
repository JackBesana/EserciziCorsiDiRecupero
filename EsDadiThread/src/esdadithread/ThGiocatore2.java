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
public class ThGiocatore2 extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();
    private int lancioDado;

    public ThGiocatore2(DatiCondivisi datiC) {
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
            datiC.setNum((int) (Math.random()) * 6);
            if (lancioDado == datiC.getNum()) {
                datiC.punteggioGiocatore2();
                if (datiC.getPunteggioGiocatore2() == 10) {
                    System.out.println("HA VINTO IL GIOCATORE 2");
                    finito = true;
                }
            }
        }
    }

}
