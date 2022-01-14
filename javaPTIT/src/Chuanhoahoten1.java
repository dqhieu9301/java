import java.util.Scanner;

public class Chuanhoahoten1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test > 0) {
            String s = sc.nextLine();
            s = s.trim();
            while(s.indexOf("  ") != -1) s = s.replaceAll("  ", " ");
            s = s.toLowerCase();
            String result[] = s.split(" ");
            String tmp = "";
            for(int i=0 ; i<result.length; i++) {
                for(int j=0 ; j<result[i].length() ; j++) {
                    if(j == 0) tmp += String.valueOf(result[i].charAt(j)).toUpperCase();
                    else tmp += result[i].charAt(j);
                }
                tmp += " ";
            }
            System.out.println(tmp);
            test--;
        }
        sc.close();
    }
}
