package Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockThread extends Thread {
    public ClockThread(String name) {
        super(name);
    }

    public void run() {
        SimpleDateFormat f = new SimpleDateFormat("dd:hh:mm:ss");
        while(true) {
            System.out.println(getName() + ": " + f.format(new Date()));
            try {
                sleep(1000);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
