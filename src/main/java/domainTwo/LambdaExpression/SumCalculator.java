package domainTwo.LambdaExpression;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;

public class SumCalculator {
    public static void main(String[] args) {
        final Calculator calculator = (a, b) -> {
            return a + (int) (b * Math.random());
        };

        BiFunction<Integer, Integer, String> biFunction = (a, v) -> {
            String result = String.valueOf(a + v);
            return a + " + " + v + " = " + result;
        };

        System.out.println(biFunction.apply(10, 10));

        //------------------ ⚠ Next ⚠ ------------------//

        new Thread(() -> System.out.println("Testing")).start();

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 11));

        var result1 = calculate(list, 2, (numbsList, divisor) -> {
            final AtomicReference<Double> total = new AtomicReference<>((double) 0);
            numbsList.forEach((a) -> {
                total.updateAndGet(v -> v + a);
            });
            return (double) total.get() / divisor;
        });

        System.out.println(result1);
    }

    private static double calculate(List<Integer> a, int b, BiFunction<List<Integer>, Integer, Double> func) {
        return func.apply(a, b);
    }
}
