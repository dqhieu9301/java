import java.util.Scanner;

public class Tinhluythua {
    public static final int Mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int a = sc.nextInt();
            long b = sc.nextLong();
            if(a == 0 && b == 0) break;;
            System.out.println(Modulo(a,b));
        }
        sc.close();
    }

    public static long Modulo(int a , long b) {
        if(b == 0) return 1;
        else {
            long res = Modulo(a , b/2);
            if(b % 2 == 0) {
                return (res * res) % Mod;
            }
            else return a *(res * res % Mod)  % Mod;
        }
    }
}
