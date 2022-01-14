package Thread;

public class Bai4 {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                String s = "Học viện công nghệ bưu chính viễn thông – khoa cntt 1";
                while(true) {
                    System.out.println(s);
                    s = s.charAt(s.length() - 1) + s.substring(0 , s.length() - 1);
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
