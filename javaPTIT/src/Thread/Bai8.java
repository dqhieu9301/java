package Thread;

public class Bai8 {
    public static void main(String[] args) {
        ClockThread c = new ClockThread("Time");
        DogThread d = new DogThread("Dog");
        PersonThread p = new PersonThread("Person");
        d.start();
        c.start();
        try {
            d.join();
            c.join();
            if(!d.isAlive()) c.wait();
        }catch (InterruptedException e) {
            System.out.println(e);
        }
        p.start();
    }
}
