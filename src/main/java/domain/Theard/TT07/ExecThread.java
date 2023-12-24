package domain.Theard.TT07;

public class ExecThread {

    public static void main(String[] args) {
        MyThread t1 = new MyThread("#1");
        MyThread t2 = new MyThread("#2");

        System.out.println("Tread #1 Suspended");

        t1.suspend();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Tread #2 Suspended");

        t2.suspend();

        System.out.println("Tread #1 Resume");

        t1.resume();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Tread #2 Resume");

        t2.resume();

        System.out.println("Tread #2 Stopped");

        t2.stop();
    }
}
