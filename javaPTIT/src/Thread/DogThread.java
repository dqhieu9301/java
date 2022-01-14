package Thread;

public class DogThread extends Thread{
    public DogThread(String name) {
        super(name);
    }

    public void run() {
        for(int i=0 ; i<=5 ; i++) {
            if(i != 5) System.out.println(getName() +": " + "Watching !! watching !!");
            else System.out.println(getName() +": " + "GO Go go");
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
