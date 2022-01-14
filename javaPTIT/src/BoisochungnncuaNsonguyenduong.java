import java.util.Scanner;

public class BoisochungnncuaNsonguyenduong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
            int n = sc.nextInt();
            long res = 1;
            for(long i=2 ; i<=n ; i++) {
                res = bcnn(res , i);
            }
            System.out.println(res);
            test--;
        }
        sc.close();
    }
    public static long ucln(long a , long b) {
        if(b == 0) return a;
        else return ucln(b , a % b);
    }
    public static long bcnn(long a , long b) {
        long res = ucln(a,b);
        return a * (b /res);
    }
}
