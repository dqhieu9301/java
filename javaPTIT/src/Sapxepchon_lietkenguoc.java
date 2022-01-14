import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sapxepchon_lietkenguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++) arr[i] = sc.nextInt();
        List<String> list = new ArrayList<>();
        for(int i=0 ; i<n-1 ; i++) {
            int x = i;
            for(int j = i+1 ; j<n ; j++) {
                if(arr[x] > arr[j]) x = j;
            }
            int temp = arr[i];
            arr[i] = arr[x];
            arr[x] = temp; 
            String tmp = "";
            for(int k=0 ; k<n ; k++) {
                if(k == n-1) tmp += String.valueOf(arr[k]);
                else tmp += String.valueOf(arr[k]) + " ";
            }
            list.add(tmp);
        }
        for(int i=list.size()-1 ; i>=0 ; i--) {
            System.out.println("Buoc " + (i+1) + ": " + list.get(i));
        }
        sc.close();
    }
}
