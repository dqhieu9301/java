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
public class GaMai extends Thread {
    @Override
    public void run() {
        while(true) {
            try {
            sleep(500);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        System.out.println("thoc thoc an an");
        }
    }
}
