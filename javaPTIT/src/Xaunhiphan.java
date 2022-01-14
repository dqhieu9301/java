import java.util.Scanner;

public class Xaunhiphan {
    public static long[]  arr = new long[93];
    public static void main(String[] args) {
        arr[1] = 1;
        arr[2] = 1;
        for(int i=3 ; i<93 ; i++) arr[i] = arr[i-1] + arr[i-2];
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0 ) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            Try(n,k);
            test--;
        }
        sc.close();
    }

    public static void Try(int n , long k) {
        if(n == 1) {
            System.out.println(0);
            return;
        }
        if(n == 2) {
            System.out.println(1);
            return;
        }
        if(k <= arr[n-2]) Try(n-2 , k);
        else Try(n-1 , k -arr[n-2]);
    }
}
