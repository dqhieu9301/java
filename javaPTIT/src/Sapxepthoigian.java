import java.util.Scanner;

public class Sapxepthoigian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<3 ; j++) arr[i][j] = sc.nextInt();
        }
        for(int i=0 ; i<n ; i++) {
            for(int j=1 ; j<n-1 ; j++) {
                for(int k =0 ; k <3 ; k++) {
                    if(arr[i][k] > arr[j][k]) {
                        
                    }
                }
            }
        }
        sc.close();
    }
}
