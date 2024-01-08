package AlgoAndStructures.LinkedLists.TestingArrays01;

public class IndexItem<T> implements Comparable<IndexItem> {
    private T value;
    int originalIndex;

    public IndexItem(T value, int originalIndex) {
        this.value = value;
        this.originalIndex = originalIndex;
    }

    public T getValue() {
        return this.value;
    }

    @Override
    public int compareTo(IndexItem o) {
        return ((Comparable) this.value).compareTo(o.value);
    }


}
