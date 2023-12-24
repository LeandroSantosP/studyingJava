package domain.Theard.TT09;

public class Consumer implements Runnable {
    Box box;
    private String name;
    private int amount;

    public Consumer(Box box, String name, int amount) {
        this.box = box;
        this.name = name;
        this.amount = amount;
        new Thread(this, name).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < this.amount; i++) {
            try {
                this.box.removeItem(this.name);
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
