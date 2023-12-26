package domainTwo.LambdaExpression;

@FunctionalInterface
public interface Calculator {
    int calc(int a, int b);
    default void printMyName() {
        System.out.println("Leandro");
    }
}
