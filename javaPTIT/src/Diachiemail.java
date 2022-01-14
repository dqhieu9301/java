
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Diachiemail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int[] arr = new int[20000];
        Arrays.fill(arr , 2);
        int n = sc.nextInt();
        sc.nextLine();
        while(n > 0) {
            String s = sc.nextLine();
            s = s.trim();
            while(s.indexOf("  ") != -1) s = s.replaceAll("  ", " ");
            s = s.toLowerCase();
            String result[] = s.split(" ");
            String tmp = "";
            tmp += result[result.length - 1];
            for(int i=0 ; i<result.length-1; i++) {
                tmp += String.valueOf(result[i].charAt(0));
            }
            if(!list.contains(tmp)) list.add(tmp);
            else {
                String res = tmp;
                tmp += String.valueOf(arr[list.indexOf(res)]);
                arr[list.indexOf(res)] ++;
            }
            tmp += "@ptit.edu.vn";
            System.out.println(tmp);
            n--;
        }
        sc.close();
    }
}
