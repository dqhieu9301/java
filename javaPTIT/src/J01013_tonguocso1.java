
import java.util.Scanner;

public class J01013_tonguocso1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int testCase = sc.nextInt();
        int[] arr = new int[2000005];
        for(int i = 0; i < 2000005; i++) {
            arr[i] = 1;
        }
        for(int i = 2; i < 2000005; i++) {
            if(arr[i] == 1) {
                for(int j = 2 * i; j < 2000005; j += i) {
                    arr[i] = 0;
                }
            }
        }
        int result = 0;
        while(testCase > 0) {
            int n = sc.nextInt();
            int i = 2;
            while(n > 1) {
                if(arr[i] == 1 && n % i == 0) {
                    n /= i;
                    result += i;
                } else {
                    i++;
                }
            }
            testCase--;
        }
        System.out.println(result);
        sc.close();
    }
}