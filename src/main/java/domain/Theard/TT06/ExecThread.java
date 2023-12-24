package domain.Theard.TT06;

public class ExecThread {

    public static void main(String[] args) {

        final String ONE = "Resource #1";
        final String TWO = "Resource #2";

        Thread t1 = new Thread() {
            @Override
            public void run() {
                super.run();
                synchronized (ONE) {
                    System.out.println("Thread #1 blocked resource #1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Thread #1 trying to access resource #2");
                    synchronized (TWO) {
                        System.out.println("Thread #1 blocked resource #2");
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                super.run();
                synchronized (TWO) {
                    System.out.println("Thread #2 blocked resource #2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Thread #2 trying to access resource #1");
                    synchronized (ONE) {
                        System.out.println("Thread #2 blocked resource #1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
