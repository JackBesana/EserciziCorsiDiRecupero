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
public class DatiCondivisi {

    private int punteggioGiocatore1;
    private int punteggioGiocatore2;
    private int num;
    private boolean finito;

    public DatiCondivisi() {
        this.num = 0;
        this.punteggioGiocatore1 = 0;
        this.punteggioGiocatore2 = 0;
        this.finito = false;
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

    public void incPunteggioGiocatore1() {
        punteggioGiocatore1++;
    }

    public void incPunteggioGiocatore2() {
        punteggioGiocatore2++;
    }

    public boolean isFinito() {
        return finito;
    }

    public void setFinito(boolean finito) {
        this.finito = finito;
    }

    public synchronized void lancio(int giocatore, int lancioDado) {
        System.out.println("GIOCATORE "+giocatore+" lancia "+lancioDado);
        System.out.println("Num "+num);
        if (lancioDado == num) {
            if (giocatore == 1 ) {
                punteggioGiocatore1++;
                if (punteggioGiocatore1 == 10) {
                    System.out.println("HA VINTO IL GIOCATORE 1");
                    setFinito(true);
                }
            }
            if (giocatore == 2 ) {
                punteggioGiocatore2++;
                if (punteggioGiocatore2 == 10) {
                    System.out.println("HA VINTO IL GIOCATORE 2");
                    setFinito(true);
                }
            }
        }
    }
    
    public synchronized void lancio1(int lancioDado) {
        System.out.println("GIOCATORE 2 lancia "+lancioDado);
        System.out.println("Num "+num);
        if (lancioDado == num) {
            punteggioGiocatore2++;
            if (punteggioGiocatore2 == 10) {
                System.out.println("HA VINTO IL GIOCATORE 2");
                setFinito(true);
            }
        }
    }
    
}
