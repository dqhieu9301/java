import java.util.Scanner;

public class Uoc_So_nto_Lon_Nhat {
    public static void main(String[] args) {
        
        int t;
        long n, r=0;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t > 0){
            n = sc.nextLong();
            
            while(n%2 == 0) {
                r = 2;
                n/=2;
            }
            
            for(long j = 3; j <= Math.sqrt(n); j+=2) {
                while(n%j == 0) {
                    r = j;
                    n/=j;
                }
                if(n < j) break;
            }
            
            if(n > 2) r = n;
            long result = r;
            System.out.println(result);
            t--;
        }
        sc.close();
    }
}
