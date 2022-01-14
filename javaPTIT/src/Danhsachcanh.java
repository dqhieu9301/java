import java.util.Scanner;


public class Danhsachcanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<n ; j++) arr[i][j] = sc.nextInt();
        }
        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<n ; j++) {
                if(arr[i][j] == 1) {
                    System.out.println("(" + (i+1) + "," + (j+1) + ")");
                    arr[j][i] = 0;
                }
            }
        }
        sc.close();

    }
}
