import java.util.Scanner;

public class Demsolanxuathien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
       for(int i=1 ; i<=test ; i++) {
           int n = sc.nextInt();
           int[] arr = new int[n];
           int[] dd = new int[100001];
           for(int j=0 ; j<100001 ; j++) dd[j] = 0;
           for(int j=0 ; j<n ; j++) {
            arr[j] = sc.nextInt();
            dd[arr[j]] ++;
           }
           System.out.println("Test " + i +":");
           for(int j=0 ; j<n ; j++) {
               if(dd[arr[j]] != 0) {
                   System.out.println(arr[j] + " xuat hien " + dd[arr[j]] + " lan");
                   dd[arr[j]] = 0;
               }
           }
       }
        sc.close();
    }
}
