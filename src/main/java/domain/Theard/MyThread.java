package domain.Theard;

public class MyThread extends Thread {
    private String name;
    private int TIME;

    public MyThread(String name, int time) {
        this.name = name;
        this.start();
        this.TIME = time;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println("Exec the Thread: " + this.name + " #counter: " + i);
                Thread.sleep(this.TIME);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("DEAD");

    }
}
