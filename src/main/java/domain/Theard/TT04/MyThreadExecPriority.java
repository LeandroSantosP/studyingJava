package domain.Theard.TT04;

public class MyThreadExecPriority {
    public static void main(String[] args) {
        MyThreadRunnable thread1 = new MyThreadRunnable("MyThread #1", 600);
        MyThreadRunnable thread2 = new MyThreadRunnable("MyThread #2", 600);
        MyThreadRunnable thread3 = new MyThreadRunnable("MyThread #3", 600);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Program Finished!");
    }
}
