import java.util.Scanner;

public class KtraFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        long[] arr = new long[92];
        arr[0] = 0;
        arr[1] = 1;
        FIBO(arr);
        while(test > 0) {
            long n = sc.nextLong();
            boolean check = false;
            for(int i=0 ; i<92 ; i++) {
                if(n == arr[i]) {
                    check = true;
                    System.out.println("YES");
                    break;
                }
            }
            if(check == false) System.out.println("NO");
            test--;
        }
        sc.close();
    }
    public static void FIBO(long arr[]) {
        for(int i=2 ; i<92 ; i++) arr[i] = arr[i-1] + arr[i-2];
    }
}
