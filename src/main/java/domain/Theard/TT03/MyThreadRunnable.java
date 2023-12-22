package domain.Theard.TT03;

public class MyThreadRunnable implements Runnable {
    private final int time;
    private final String name;

    public MyThreadRunnable(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(this.name + " counter: " + i);
                Thread.sleep(this.time);
            }
        } catch (InterruptedException ignored) {
            ignored.printStackTrace();
        }
        System.out.println("DEAD THREAD + " + this.name);

    }
}
