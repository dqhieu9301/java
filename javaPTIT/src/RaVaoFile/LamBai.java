/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RaVaoFile;


/**
 *
 * @author manhd
 */
public class LamBai extends Thread{
       public void run() {
           for(int i = 1; i < 5; i++) {
               try {
                   sleep(1000);
               } catch (InterruptedException ex) {
                   System.out.println(ex);
               }
               System.out.println("Lam mon " + i);
           }
       }
}   
