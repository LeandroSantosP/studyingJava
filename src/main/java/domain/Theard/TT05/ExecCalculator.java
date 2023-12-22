package domain.Theard.TT05;

import java.util.Arrays;

public class ExecCalculator {
    public static void main(String[] args) {
        int[] numbs = {1, 2, 3, 4, 5};
        MyThreadSum thread1 = new MyThreadSum("#1", numbs);
        MyThreadSum thread2 = new MyThreadSum("#2", numbs);
    }
}
