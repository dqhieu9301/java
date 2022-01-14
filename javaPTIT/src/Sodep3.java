import java.util.Scanner;

public class Sodep3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
            String s = sc.next();
            if(check1(s) == true && check2(s) == true) System.out.println("YES");
            else System.out.println("NO");
            test--;
        }
        sc.close();
    }
    public static boolean check1(String s) {
        for(int i=0 ; i<s.length() ; i++) {
            if(s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7' ) return false;
        }
        return true;
    }
    public static boolean check2(String s) {
        int right = s.length() - 1 , left = 0; 
        while(right != left && left - right != 1) {
            if(s.charAt(right) == s.charAt(left)) {
                left ++;
                right --;
            }
            else return false;
        }
        return true;
    }
}
