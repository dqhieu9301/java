package Thread;

public class RunnableDemo implements Runnable {
    String name;
    public RunnableDemo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " START");
        for(int i=0 ; i<5 ; i++) {
            System.out.println(name + " " + i);
            try {
                Thread.sleep(2000);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(name + " END");
    }
}
