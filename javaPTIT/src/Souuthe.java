import java.util.Scanner;

public class Souuthe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
            String s = sc.next();
            if(check(s)) {
                int c = 0 , l =0;
                for(int i=0 ; i<s.length() ; i++) {
                    int tmp  = s.charAt(i) - '0';
                    if(tmp % 2 == 0) c++;
                    else l++;
                }
                if(c > l && s.length() % 2 == 0) System.out.println("YES");
                else {
                    if(c < l && s.length() % 2 != 0) System.out.println("YES");
                    else System.out.println("NO");
                }
            }
            else System.out.println("INVALID");
            test --;
        }
        sc.close();
    }

    public static boolean check(String s) {
        for(int i=0 ; i<s.length() ; i++) {
            if(s.charAt(i) < '0' || s.charAt(i) > '9') return false;
        }
        return true;
    }
}
