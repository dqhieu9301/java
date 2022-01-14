/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RaVaoFile;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author manhd
 */
public class Alarm extends Thread {
    SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss");
    private String date;
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public void run() {
        while(true) {
            String time = f.format(new Date());
            System.out.println(time);
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            if(time.endsWith(date)) {
                System.out.println("***** RENG RENG RENG *****");
                break;
            }
        }
    }
}
