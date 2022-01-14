package Thread;

public class ThreadDemo extends Thread{
     public ThreadDemo(String name) {
         super(name);
     }

     public void run() {
         System.out.println(this.getName() + " " + "START");
         for(int i=0 ; i<5 ; i++) {
             System.out.println(this.getName() + " " + i);
             try {
                sleep(1000); // 1000 = 1 giay
             } catch(InterruptedException e) {
                 System.out.println(e);
             }
         }
         System.out.println(this.getName() + " " + "END");
     }
}
