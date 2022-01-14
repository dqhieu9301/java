import java.util.Scanner;

public class Chiatamgiac {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
            int N = sc.nextInt();
            int H = sc.nextInt();
            for(int i = 1; i < N; i++) {
                double d = (double)(H*(Math.sqrt((double)i/N)));
                System.out.printf("%6f ", d);
            }
            System.out.println();
            test --;
        }
        sc.close();
    }
}
