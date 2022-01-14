import java.util.Scanner;


public class Uocsochiahetcho2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
            long n = sc.nextLong();
            if(n % 2 !=0) System.out.println(0);
            else Solution(n);
            test--;
        }
        sc.close();
    }
    public static void Solution(long n) {
        int count = 0;
        while(n > 0 && n % 2 == 0) { 
            count ++;
            n /= 2;
        }
        int temp = 0;
        for(int i=3 ; i<=Math.sqrt(n) ; i+=2) {
            if(n % i == 0) {
                temp++;
                if(n / i >Math.sqrt(n)) temp ++;
            }
        }
        if(n == 1) temp ++;
        else temp += 2;
        if(temp > 0) System.out.println(temp * count);
    }
}
