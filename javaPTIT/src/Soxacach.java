import java.util.Arrays;
import java.util.Scanner;

public class Soxacach {
    public static int n;
    public static int[] arr = new int[10];
    public static boolean[] dd = new boolean[10];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
            n = sc.nextInt();
            Arrays.fill(dd,true);
            Try(1);
            test--;
        }
        sc.close();
    }

    public static void Try(int i) {
        if(i > n) {
            if(Check()) {
                for(int j=1 ; j<=n ; j++) System.out.print(arr[j]);
                System.out.println();
            }
        }
        for(int j=1 ; j<=n ; j++) {
            if(dd[j]) {
                dd[j] = false;
                arr[i] = j;
                Try(i+1);
                dd[j] = true;
            }
        }
    }

    public static boolean Check() {
        for(int i=2 ; i<=n ; i++) {
            if(Math.abs(arr[i] - arr[i-1]) == 1) return false;
        }
        return true;
    }
}
