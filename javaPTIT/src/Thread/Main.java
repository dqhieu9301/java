package Thread;

public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName()); // ten luong
        System.out.println(t.getState()); //trang thai
        System.out.println(t.getPriority()); // do uu tien

        ThreadDemo d = new ThreadDemo("quanghieu");
        d.start();

        RunnableDemo r = new RunnableDemo("dqh");
        Thread t1 = new Thread(r);
        t1.start();
    }
}
