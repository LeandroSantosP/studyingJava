package domain.Theard.TT07;

public class MyThread implements Runnable {
    private final String name;

    private boolean isSuspense;

    private boolean isFinished;

    public MyThread(String name) {
        this.name = name;
        this.isSuspense = false;
        new Thread(this, name).start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("<Inside>Exec " + this.name + ", " + i);
                Thread.sleep(300);
                synchronized (this) {
                    while (this.isSuspense) {
                        wait();
                    }
                    if (this.isFinished) {
                        break;
                    }
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Tread " + this.name + " Finalised");
    }

    void suspend() {
        this.isSuspense = true;
    }

    synchronized void resume() {
        this.isSuspense = false;
        notify();
    }

    synchronized void stop() {
        this.isFinished = true;
        notify();
    }
}
