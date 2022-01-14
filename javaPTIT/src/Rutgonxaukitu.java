import java.util.Scanner;
import java.util.Stack;

public class Rutgonxaukitu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> stk = new Stack<>();
        for(int i=0 ; i<s.length() ; i++) {
            stk.push(s.charAt(i));
            if(stk.size() >= 2) {
                Character s1 = stk.pop();
                Character s2 = stk.pop();
                if(s1 != s2) {
                    stk.push(s2);
                    stk.push(s1);
                }
            }
        }
        if(stk.size() == s.length()) System.out.println(s);
        else { 
            if(stk.size() == 0) System.out.println("Empty String");
            else {
                String res = "";
                while(!stk.empty()) {
                    Character tmp = stk.pop();
                    res = tmp + res;
                }
                System.out.println(res);
            }
        }
        sc.close();
    }
}
