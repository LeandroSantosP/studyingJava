package domain.Theard.TT05;

public class MyThreadSum implements Runnable {
    private final String name;
    private int[] numbs;
    private static final Calculator calc = new Calculator();

    public MyThreadSum(String name, int[] numbs) {
        this.name = name;
        this.numbs = numbs;
        new Thread(this, name).start();
    }
    @Override
    public void run() {
        System.out.println(this.name + " STARTED");
        int sum = MyThreadSum.calc.arraySum(this.numbs);
        System.out.println(this.name + " FINAL SUM RESULT: " + sum);
    }
}
