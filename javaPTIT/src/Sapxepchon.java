import java.util.Scanner;

public class Sapxepchon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ; i++) arr[i] = sc.nextInt();
        int count = 1;
        for(int i=0 ; i<n-1 ; i++) {
            int x = i;
            for(int j=i+1 ; j<n ; j++) {
                if(arr[x] > arr[j]) {
                    x = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[x];
            arr[x] = tmp;
            System.out.print("Buoc " + count + ": ");
            for(int k=0 ; k<n ; k++) System.out.print(arr[k] + " ");
            System.out.println();
            count ++;
            sc.close();
        }
    }
}
