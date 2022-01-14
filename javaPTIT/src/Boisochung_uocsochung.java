import java.util.Scanner;

public class Boisochung_uocsochung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.print(BCNN(a,b) + " ");
            System.out.println(UCLN(a,b));
            test--;
        }
        sc.close();
    }
    public static long UCLN(long a , long b) {
        if(b == 0) return a;
        return UCLN(b , a % b);
    }
    public static long BCNN(long a  , long b) {
        long result = UCLN(a,b);
        return a * b / result;
    }
}
