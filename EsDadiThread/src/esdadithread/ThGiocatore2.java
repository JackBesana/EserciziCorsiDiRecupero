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

    private int lancioDado;

    public ThGiocatore2() {
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

    }

}
