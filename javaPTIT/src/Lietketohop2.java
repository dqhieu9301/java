import java.util.Scanner;

public class Lietketohop2 {
    public static int[] arr = new int[10];
    public static int n , k , res;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        res = 0;
        Try(1);
        System.out.println();
        System.out.println("Tong cong co " + res + " to hop");
        sc.close();
    }

    public static void Try(int i) {
        for(int j= arr[i-1] + 1 ; j<= n-k+i ; j++) {
            arr[i] = j;
            if(i == k) {
                res ++;
                for(int l=1 ; l<=k ; l++) System.out.print(arr[l]);
                System.out.print(" ");
            }
            else Try(i+1);
        }
    }
}
