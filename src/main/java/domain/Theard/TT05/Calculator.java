package domain.Theard.TT05;
public class Calculator {
    public int sum;
    synchronized public int arraySum(int[] array) {
        this.sum = 0;
        for (int j : array) {
            this.sum += j;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return this.sum;
    }

}
