package AlgoAndStructures.LinkedLists.ArrayListString;

public class IndexItem implements Comparable<IndexItem> {
    String value;
    int originalIndex;
    public IndexItem(String value, int originalIndex) {
        this.value = value;
        this.originalIndex = originalIndex;
    }
    @Override
    public int compareTo(IndexItem o) {
        return (this.value).compareTo(o.value);
    }
}
