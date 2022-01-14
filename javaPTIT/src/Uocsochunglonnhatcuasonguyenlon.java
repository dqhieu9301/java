import java.util.Scanner;

public class Uocsochunglonnhatcuasonguyenlon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
            long a = sc.nextInt();
            String b = sc.next();
            long res = Mol(a ,b);
            long result = gcd(res,a);
            System.out.println(result);
            test--;
        }
        sc.close();
    }
    public static long Mol(long a , String b) {
        long result = 0;
        for(int i=0 ; i<b.length() ; i++) {
            result = (result * 10 + b.charAt(i) - '0') % a;
        }
        return result;
    }
    public static long gcd(long a , long b) {
        return b == 0 ? a : gcd(b, a % b );
    }
}
