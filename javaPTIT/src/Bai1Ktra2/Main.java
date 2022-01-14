package Bai1Ktra2;


public class Main {
    public static void main(String[] args) {
        String s = "12/03/2001";
        String tmp = "{1-2}[0-9]/{1-2}[0-9]/{4}[0-9]";
        if(s.matches(tmp)) System.out.println("yes");
        else System.out.println("no");
    }
}
