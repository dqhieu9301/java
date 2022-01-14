package Thread;

public class Bai6 {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for(int i=10 ; i>=0 ;  i--) {
                    if(i != 0) System.out.println("cuc cu");
                    else System.out.println("cuc cu - cuc cu - cuc cu");
                    try {
                        sleep(1000);
                    } catch(InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }
        }.start();
    }
}
