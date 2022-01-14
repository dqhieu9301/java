import java.util.Arrays;
import java.util.Scanner;

public class Tonguocso {
    public static boolean[] dd = new boolean[2000006];
    public static int[] arr = new int[2000006];
    public static int k = 0;
    public static void main(String[] args) {
        Sangnt();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = 0;
        for(int i=1 ; i<=n ; i++) {
            int x = sc.nextInt();
            if(dd[x]) result += x;
            else {
                int t = 0;
                while(x != 1) {
                    while(x % arr[t] == 0) {
                        x /= arr[t];
                        result += arr[t];
                    }
                    t++;
                    if(dd[x]) {
                        result += x;
                        break;
                    }
                }
            }
        }
        System.out.println(result);
        sc.close();
    }

    public static void Sangnt() {
        Arrays.fill(dd, true);
        dd[0] = false;
        dd[1] = false;
        for(int i=2 ; i <= Math.sqrt(2000005) ; i++) {
            if(dd[i]) {
                arr[k] = i; 
                k++;
                for(int j= i * i ; j<= 2000005 ; j+= i) dd[j] = false;
            }
        }
    }
}
