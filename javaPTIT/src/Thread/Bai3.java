package Thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so n:");
        int n = sc.nextInt();
        int[] arr = new int[100000];
        Arrays.fill(arr, 1);
        List<Integer> list = new ArrayList<>();
        for(int i=2 ; i<100000 ; i++) {
            if(arr[i] == 1) {
                for(int j=2*i ; j<100000 ; j+=i) arr[j] = 0;
            }
        }
        for(int i=2 ; i<100000 ; i++) {
            if(arr[i] == 1 && i % 10 == 3) {
                list.add(i);
            }
        }
        new Thread() {
            @Override
            public void run() {
                for(int i=n ; i>= 0 ; i--) {
                    System.out.println(i);
                    System.out.println("snt" + " " + list.get(0));
                    list.remove(0);
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
