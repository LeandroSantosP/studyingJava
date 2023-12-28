package domainTwo.LambdaExpression;

import java.util.List;

@FunctionalInterface
public interface Filter<L> {
    List<L> exec(List<L> items, int startIndex, int endIndex);
}
