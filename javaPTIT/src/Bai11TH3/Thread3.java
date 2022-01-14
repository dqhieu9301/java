/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai11TH3;

/**
 *
 * @author dinhh
 */
public class Thread3 extends Thread{
    Data d;
    
    public Thread3(Data d) {
        this.d = d;
    }
    
    public void run() {
        while(true) {
            synchronized(d) {
                while(d.isRunning() && d.getIndex() != 3) {
                    try {
                        d.wait();
                    } catch(InterruptedException e) {
                        System.out.println(e);
                    }
                }
                if(!d.isRunning()) break;
                System.out.println("Binh phuong la : " + (d.getNum() * d.getNum()));
                d.notifyAll();
                try {
                        d.wait();
                    } catch(InterruptedException e) {
                        System.out.println(e);
                    }
            }
        }
    }
}
