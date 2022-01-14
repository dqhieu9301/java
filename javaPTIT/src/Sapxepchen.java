import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sapxepchen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++) arr[i] = sc.nextInt();
        List<Integer> lt = new ArrayList<>();
        for(int i=0 ; i<n ; i++) {
            lt.add(arr[i]);
            lt.sort((o1, o2) -> o1 - o2);
            System.out.print("Buoc " + i + ": ");
            for(int j=0 ; j<lt.size() ; j++) System.out.print(lt.get(j)+ " ");
            System.out.println();
        }
        sc.close();
    }
}
