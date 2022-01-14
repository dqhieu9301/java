import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sapxepnoibot_lietkenguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0 ; i<n ; i++) arr[i] = sc.nextInt();
            List<String> list = new ArrayList<>();
            for(int i=0 ; i<n-1 ; i++) {
                boolean check = false;
                for(int j=0 ; j<n-i-1 ; j++) {
                    if(arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        check = true;
                    }
                }
                if(check == false) break;
                String tmp = "";
                for(int k=0 ; k<n ; k++) {
                    tmp += String.valueOf(arr[k]) + " ";
                }
                list.add(tmp);
            }
            for(int i=list.size()-1 ; i>=0 ; i--) System.out.println("Buoc " + (i+1) + ": " + list.get(i));
            test--;
        }
        sc.close();
    }
}
