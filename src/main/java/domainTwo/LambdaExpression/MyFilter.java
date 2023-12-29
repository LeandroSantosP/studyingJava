package domainTwo.LambdaExpression;
import java.util.ArrayList;
import java.util.List;

public class MyFilter<L> implements Filter<L> {
    public List<L> exec(List<L> items, int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > items.size() || startIndex > endIndex) {
            throw new IllegalArgumentException("Invalid indexes");
        }
        List<L> itemsFilter = new ArrayList<>();
        for (int i = startIndex; i < endIndex; i++) {
            itemsFilter.add(items.get(i));
        }
        return itemsFilter;
    }
}
