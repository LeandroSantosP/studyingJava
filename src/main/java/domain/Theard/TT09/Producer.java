package domain.Theard.TT09;

public class Producer implements Runnable {
    Box box;
    private String name;
    private int amount;

    public Producer(Box box, String name, int amount) {
        this.box = box;
        this.name = name;
        this.amount = amount;
        new Thread(this, name).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < this.amount; i++) {
            try {
                this.box.addItem(this.name);
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
