import java.util.Scanner;

public class Tichmatranvoichuyenvi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test = sc.nextInt();
        int t = 1;
        while(t <= test) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr1 = new int[n][m];
            int[][] arr2 = new int[m][n];
            for(int i=0 ; i<n ; i++) {
                for(int j=0 ; j<m; j++) {
                    arr1[i][j] = sc.nextInt();
                    arr2[j][i] = arr1[i][j];
                }
            }
            System.out.println("Test " + t + ":");
            for(int i=0 ; i<n ; i++) {
                for(int j=0 ; j<n ; j++) {
                    int res = 0;
                    for(int k=0 ; k<m ; k++) {
                        res += arr1[i][k] * arr2[k][j];
                    }
                    System.out.print(res + " ");
                }
                System.out.println();
            }
            t++;
        }
        sc.close();
    }
}
