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
public class Thread2 extends Thread{
    Data d;
    
    public Thread2(Data d) {
        this.d = d;
    }
    
    public void run() {
        while(true) {
            synchronized(d) {
                while(d.isRunning() && d.getIndex() != 2) {
                    try {
                        d.wait();
                    } catch(InterruptedException e) {
                        System.out.println(e);
                    }
                }
                if(!d.isRunning()) break;
                System.out.print(d.getNum() + " = ");
                for(int i=1 ; i<d.getNum() ; i++) {
                    if(d.getNum() % i == 0) System.out.print(i + " , ");
                }
                System.out.print(d.getNum());
                System.out.println();
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
