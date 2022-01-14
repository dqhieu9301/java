/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;


/**
 *
 * @author dinhh
 */
public class ThreadColor extends Thread{
    @Override
    public void run() {
        while(true) {
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            System.out.println("\033[33m" + "thoc thoc an an");
            System.out.println("\033[31m" + "thoc thoc an an");
        }
    }
}
