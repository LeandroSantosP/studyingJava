package domain.Theard.TT09;

public class Exec {
    public static void main(String[] args) {
        Box box = new Box(10);
        new Producer(box, "Joao", 10);
        new Consumer(box, "Mario", 10);
    }
}
