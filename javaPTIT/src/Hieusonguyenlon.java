import java.math.BigInteger;
import java.util.Scanner;

public class Hieusonguyenlon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger s1 = sc.nextBigInteger();
        BigInteger s2 = sc.nextBigInteger();
        BigInteger res = s1.subtract(s2);
        System.out.println(res);
        sc.close();
    }
}
