import java.util.Scanner;

public class Phantichthuasont {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=1 ; i<=test ; i++) {
            long n = sc.nextLong();
            System.out.print("Test " + i + ": ");
            int count = 0, j = 2;
            while(n > 1){
                if(n % j == 0){
                    n = n/j;
                    count ++;
                }
                if(n % j != 0){
                    if(count > 0){
                        System.out.print(j + "(" + count + ") ");
                        count = 0;
                    }
                    j = j + 1;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
