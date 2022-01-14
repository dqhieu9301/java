package Thread;

public class PersonThread extends Thread{
    public PersonThread(String name) {
        super(name);
    }

    public void run() {
        for(int i=10 ; i<=50 ; i+=10) {
            System.out.println(getName() + ": " + i);
        }
    }
}
