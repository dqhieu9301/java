import java.math.BigInteger;
import java.util.Scanner;

public class Tongsonguyenlon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
            BigInteger b1 = sc.nextBigInteger();
            BigInteger b2 = sc.nextBigInteger();
            BigInteger res = b1.add(b2);
            System.out.println(res);
            test --;
        }
        sc.close();
    }
}
