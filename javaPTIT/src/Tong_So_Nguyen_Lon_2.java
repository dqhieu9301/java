import java.util.Scanner;

public class Tong_So_Nguyen_Lon_2 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        nhap();
    }

    static String daoXau(String s) {
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            s1 += s.charAt(s.length() - 1 - i);
        }
        return s1; //chuoi sau khi dao
    }
    
    static String add(String s1, String s2) {
        String s = "";
    
        int len1 = s1.length();
        int len2 = s2.length();
        int max = Math.max(len1, len2);
        s1 = daoXau(s1);
        s2 = daoXau(s2);
        
        //thuc hien noi them so 0 vao chuoi voi muc dich lam cho 2 chuoi so bang nhau
        if (max > len1) {
            for (int i = max; i >= len1; i--) {
                s1 += "0";
            }
        }
        if (max > len2) {
            for (int i = max; i >= len2; i--) {
                s2 += "0";
            }
        }
        
        //thuc hien phep cong
        int temp = 0;
        for (int i = 0; i < max; i++) {
            int tong = 0;
            //charAt ky tu tai vi tri thu i trong xau
            tong = s1.charAt(i) - '0' + s2.charAt(i) - '0' + temp;
            s += tong % 10;
            temp = tong / 10;
        }
        if (temp == 1) {
            s += 1;
        }        
        //thuc hien dao xau truoc khi xuat
        s = daoXau(s);
        return s;
    }
    
    static void nhap() {
        String s1, s2;
        s1 = sc.next();
        s2 = sc.next();
        //xuat tong
        String ss = add(s1, s2);
        //bỏ số 0
        int index = 0;
        for (int i = 0; i < ss.length(); i++) {
            if(ss.charAt(i) != '0') {
                break;
            }
            index++;
        }
        String res = "";
        for (int i = index; i < ss.length(); i++) {
            res += ss.charAt(i);
        }
        System.out.println(res);
    }
}