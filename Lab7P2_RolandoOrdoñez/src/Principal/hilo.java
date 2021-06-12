/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import javax.swing.JProgressBar;

/**
 *
 * @author Rolando
 */
public class hilo extends Thread {
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private int dur;

    public hilo(JProgressBar barra,int dur) {
        this.barra = barra;
        this.avanzar = true;
        this.vive = true;
        this.dur = dur;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public int getDur() {
        return dur;
    }

    public void setDur(int dur) {
        this.dur = dur;
    }
    @Override
    public void run(){
        while (vive){
            if (avanzar){
                barra.setValue(barra.getValue()+1);
                if(barra.getValue()==dur){
                    vive = false;
                }
            }
            try {
                Thread.sleep(350);
            }
            catch (InterruptedException ex){
                
            }
        }
    }
}
