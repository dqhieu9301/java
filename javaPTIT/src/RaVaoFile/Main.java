/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RaVaoFile;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author manhd
 */
public class Main {
    public static void main(String[] args) {
        SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss");
        System.out.println("Hiện thời: " + f.format(new Date()));
        System.out.print("Gõ vào thời gian báo chuông: ");
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        Alarm t1 = new Alarm();
        LamBai t2 = new LamBai();
        t1.setDate(date);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        t2.start();
        sc.close();
    }
}
