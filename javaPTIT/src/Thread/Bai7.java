package Thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thoi gian bao thuc - dinh dang hh:mm:ss");
        String s = sc.next();
        new Thread() {
            @Override
            public void run() {
                SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss");
                while(true) {
                    String tmp = String.valueOf(f.format(new Date()));
                    if(s.equals(tmp)) {
                        System.out.println("****** RENG RENG RENG *******");
                        break;
                    }
                    else {
                        System.out.println(f.format(new Date()));
                    }
                    try {
                        sleep(1000);
                    } catch(InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }
        }.start();
        sc.close();
    }
}
