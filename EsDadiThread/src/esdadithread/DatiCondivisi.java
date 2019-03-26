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
public class DatiCondivisi {

    private int punteggioGiocatore1;
    private int punteggioGiocatore2;
    private int num;

    public DatiCondivisi() {
        this.num = 0;
        this.punteggioGiocatore1 = 0;
        this.punteggioGiocatore2 = 0;
    }

    public int getPunteggioGiocatore1() {
        return punteggioGiocatore1;
    }

    public void setPunteggioGiocatore1(int punteggioGiocatore1) {
        this.punteggioGiocatore1 = punteggioGiocatore1;
    }

    public int getPunteggioGiocatore2() {
        return punteggioGiocatore2;
    }

    public void setPunteggioGiocatore2(int punteggioGiocatore2) {
        this.punteggioGiocatore2 = punteggioGiocatore2;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void punteggioGiocatore1() {
        punteggioGiocatore1++;
    }

    public void punteggioGiocatore2() {
        punteggioGiocatore2++;
    }
}
