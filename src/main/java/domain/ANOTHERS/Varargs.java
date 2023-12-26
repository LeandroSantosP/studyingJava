package domain.ANOTHERS;

import java.util.Arrays;

public class Varargs {

    public static void main(String[] args) {
        System.out.println(sum(2, 3));
        System.out.println(sum(2, 3, 2));
        int[] numbs = {1, 2, 3, 4, 5};
        System.out.println(sum(numbs));
        System.out.println(sumVarargs(10, 10, 10));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static int sum(int[] numbs) {
        return Arrays.stream(numbs).reduce(0, Integer::sum);
    }

    static int sumVarargs(int a, int b, Integer... numbs) {
        return Arrays.stream(numbs).reduce(0, Integer::sum);
    }
}
