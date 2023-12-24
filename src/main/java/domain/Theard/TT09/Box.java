package domain.Theard.TT09;

public class Box {
    private int current_quantity;
    private final int capacity;

    public Box(int capacity) {
        this.capacity = capacity;
        this.current_quantity = 0;
    }

    public synchronized void addItem(String person) throws InterruptedException {
        while (this.current_quantity == capacity) {
            System.out.println("BOX IS FULL WAITING: " + this.current_quantity);
            wait();
        }
        this.current_quantity++;
        System.out.println("Item Added By: " + person + ", Items on Box: " + this.current_quantity);
        notify();
    }

    public synchronized void removeItem(String person) throws InterruptedException {
        while (this.current_quantity == 0) {
            System.out.println("BOX IS EMPTY WAITING: " + this.current_quantity);
            wait();
        }

        this.current_quantity--;
        System.out.println("Item Removed by: " + person + ", Items on Box: " + this.current_quantity);
        notify();
    }
}
