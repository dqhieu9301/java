import java.util.Scanner;

public class Diemcanbang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            long sum = 0 , res = 0;
            for(int i=0 ; i<n ; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            int i=1;
            boolean check = false;
            sum -= arr[0];
            while(i < n-1) {
                res += arr[i-1];
                sum = sum - arr[i];
                if(sum == res) {
                    System.out.println(i+1);
                    check = true;
                    break;
                }
                i++;
            }
            if(!check) System.out.println(-1);
            test --;
        }
        sc.close();
    }
}
