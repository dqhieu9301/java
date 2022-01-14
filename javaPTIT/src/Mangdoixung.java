import java.util.Scanner;

public class Mangdoixung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ; i<n ; i++) arr[i] = sc.nextInt();
            if(n % 2 == 0) {
                boolean check = true;
                for(int i=0 ; i<=n/2-1 ; i++) {
                    if(arr[i] != arr[n-i-1]) {
                        check = false;
                        break;
                    }
            }
            if(check == true) System.out.println("YES");
            else System.out.println("NO");
            }
            else {
                boolean check = true;
                for(int i=0 ; i<=n/2 ; i++) {
                    if(arr[i] != arr[n-i-1]) {
                        check = false;
                        break;
                    }
                }
                if(check == true) System.out.println("YES");
                else System.out.println("NO");
            }
            test--;
        }
        sc.close();
    }
}
