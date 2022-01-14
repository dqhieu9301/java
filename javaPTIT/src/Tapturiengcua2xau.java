import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tapturiengcua2xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            s1.trim();
            s1 = s1.replaceAll("  ", " ");
            s2 = s2.replaceAll("  ", " ");
            s2.trim();
            List<String> lt = new ArrayList<>();
            String[] str = s1.split(" ");
            for(int i=0 ; i<str.length ; i++) {
                if(!s2.contains(str[i]) && !lt.contains(str[i])) {
                    lt.add(str[i]);
                }
            }
            Collections.sort(lt);
            for(int i=0 ; i<lt.size() ; i++) System.out.print(lt.get(i) + " ");
            System.out.println();
            test --;
        }
        sc.close();
    }
}
