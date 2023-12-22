package domain.Theard.TT02;

public class MyThreadRunnableExec {
    public static void main(String[] args) {
        MyThreadRunnable thread1 = new MyThreadRunnable("MyThread #1", 600);
        MyThreadRunnable thread2 = new MyThreadRunnable("MyThread #2",900);
    }
}
