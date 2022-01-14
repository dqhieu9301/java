import java.util.Scanner;

public class Uocsont {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
            long n = sc.nextLong();
            while(n > 0 && n % 2 == 0) {
                n/=2;
            }
            for(int i=3 ; i<=Math.sqrt(n) ; i+=2) {
                while(n > 0 && n % i == 0) n /= i;
            }
            if(n > 2) System.out.println(n);
            test--; 
        }
        sc.close();
    }
}
