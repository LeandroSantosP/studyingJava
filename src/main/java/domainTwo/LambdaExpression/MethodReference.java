package domainTwo.LambdaExpression;

import java.util.List;
import java.util.function.Consumer;

public class MethodReference {
    public static void main(String[] args) {
        Consumer<String> consumer = (String txt) -> System.out.println("Text: " + txt);
        consumer.accept("My text");

        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("My text With reference");

        MyFilter<String> myFilter = new MyFilter<>();
        List<String> input = List.of("leandro", "John joe");
        // must be a Functional interface.
        System.out.println(myFilter.exec(input, 0, 1));


        List<Integer> input2 = List.of(1, 2, 3, 4, 5, 6);
        myForeach(input2, (x) -> print(x));
    }

    static private <T> void print(T x) {
        System.out.println(x);
    }

    static <T> void myForeach(List<T> list, Consumer<T> consumer) {
        list.forEach(consumer);
    }
}
