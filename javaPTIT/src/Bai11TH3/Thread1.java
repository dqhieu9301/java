/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai11TH3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author dinhh
 */
public class Thread1 extends Thread{
    Data d;
    
    public Thread1(Data d) {
        this.d = d;
    }
    
    public void run() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("E:/JAVA VS/javaPTIT/src/Bai11TH3/Number.txt"));
            String line = null;
            line = br.readLine();
            FileWriter fw = new FileWriter("E:/JAVA VS/javaPTIT/src/Bai11TH3/OutPut.txt");
            fw.write(line);
            synchronized(d) {
                while((line = br.readLine()) != null) {
                    sleep(1000);
                    line = line.trim();
                    line = line.replaceAll("  ", " ");
                    System.out.println("Doc duoc so : " +line);
                    fw.write(line);
                    int num = Integer.parseInt(line);
                    d.setNum(num);
                    if(num % 2 == 0) d.setIndex(2);
                    else d.setIndex(3);
                    d.notifyAll();
                    d.wait();
                }
                fw.close();
                d.setRunning(false);
                d.notifyAll();
            }
        
        } catch(FileNotFoundException e) {
            System.out.println(e);
        } catch(IOException e) {
            System.out.println(e);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}
