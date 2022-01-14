import java.util.Scanner;

public class Chuanhoahoten2 {
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
            for(int i=1 ; i<result.length; i++) {
                for(int j=0 ; j<result[i].length() ; j++) {
                    if(j == 0) tmp += String.valueOf(result[i].charAt(j)).toUpperCase();
                    else tmp += result[i].charAt(j);
                }
                if(i < result.length - 1) tmp += " ";
                else tmp += ", ";
            }
            tmp += String.valueOf(result[0]).toUpperCase();
            System.out.println(tmp);
            test--;
        }
        sc.close();
    }
}
