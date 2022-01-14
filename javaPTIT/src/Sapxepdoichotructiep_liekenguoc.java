import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sapxepdoichotructiep_liekenguoc {
    public static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
            int n = sc.nextInt();
            list.clear();
            int[] arr = new int[n];
            for(int i=0 ; i<n ; i++) arr[i] = sc.nextInt();
            InterchangeSort(arr, n);
            for(int i=list.size()-1 ; i>=0 ; i--) System.out.println("Buoc " + (i+1) + ": " + list.get(i));
            test --;
        }
        sc.close();
    }

    public static void InterchangeSort(int arr[] , int n) {
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
                String tmp = "";
                for(int k=0 ; k<n ; k++) tmp += String.valueOf(arr[k]) + " ";
                list.add(tmp);
            }
        }
    }
}