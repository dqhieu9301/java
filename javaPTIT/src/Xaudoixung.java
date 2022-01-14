
import java.util.Scanner;

public class Xaudoixung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
            String s = sc.next();
            if(s.length() % 2 == 0) {
                if(CheckC(s)) System.out.println("YES");
                else System.out.println("NO");
            }
            else {
                if(CheckL(s)) System.out.println("YES");
                else System.out.println("NO");
            }
            test--;
        }
        sc.close();
    }

    public static boolean CheckC(String s) {
        int count = 0;
        for(int i=0 ; i<s.length()/2  ; i++) {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i )) count ++;
            if(count > 1) return false;
        }
        if(count == 0) return false;
        else return true;
    }

    public static boolean CheckL(String s) {
        int count = 0;
        for(int i=0 ; i<s.length()/2 +1 ; i++) {
            if(s.charAt(i) != s.charAt(s.length() - i -1)) count ++;
            if(count > 1) return false;
        }
        if(count == 0) return true;
        else return true;
    }
}
