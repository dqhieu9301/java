import java.util.Scanner;

public class Sapxepdoichotructiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++) arr[i] = sc.nextInt();
        InterchangeSort(arr, n);
        sc.close();
    }
    public static void InterchangeSort(int arr[] , int n) {
        int count = 1;
        for(int i=0 ; i<n ; i++) {
            boolean kt = false;
            for(int j=i+1 ; j<n ; j++) {
                if(arr[i] > arr[j]) {
                    kt = true;
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            if(kt == true) {
                System.out.print("Buoc " + count +": ");
                    for(int k=0 ; k<n ; k++) System.out.print(arr[k] + " ");
                    System.out.println();
                    count ++;
            }
        }
    }
}
