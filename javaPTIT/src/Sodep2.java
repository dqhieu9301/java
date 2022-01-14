import java.util.Scanner;

public class Sodep2 {
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
        int sum = 0;
        if(s.charAt(0) != '8' || s.charAt(s.length()-1) != '8') return false;
        for(int i=0 ; i<s.length() ; i++) sum += (s.charAt(i) - 48);
        if(sum % 10 == 0) return true;
        else return false;
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
