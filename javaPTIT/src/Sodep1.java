
import java.util.Scanner;

public class Sodep1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
            String s = sc.next();
            if(check(s) == true) System.out.println("YES");
            else System.out.println("NO");
            test--;
        }
        sc.close();
    }
    public static boolean check(String s) {
        int right = s.length() - 1 , left = 0; 
        while(right != left && left - right != 1) {
            if(s.charAt(right) == s.charAt(left) && (s.charAt(left) - 48) % 2 == 0) {
                left ++;
                right --;
            }
            else return false;
        }
        return true;
    }
}
