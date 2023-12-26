package domainTwo.LambdaExpression;

import java.util.function.BiFunction;

public class SumCalculator {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> {
            return a + (int) (b * Math.random());
        };

        BiFunction<Integer, Integer, String> biFunction = (a, v) -> {
            String result = String.valueOf(a + v);
            return a + " + " + v + " = " + result;
        };

        var result1 = calculate(0, 20, (valueOne, valueTwo) -> valueOne - valueTwo);
        System.out.println(biFunction.apply(10, 10));
        System.out.println(result1);
    }

    private static int calculate(int a, int b, BiFunction<Integer, Integer, Integer> func) {
        return func.apply(a, b);
    }
}
