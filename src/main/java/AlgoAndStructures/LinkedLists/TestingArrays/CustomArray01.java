package AlgoAndStructures.LinkedLists.TestingArrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomArray01 {
    private String[] itens;
    private int size = 0;

    public CustomArray01(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("quantity must be greater than 0");
        }
        this.itens = new String[capacity];
    }

    public String get(int index) {
        validationIndex(index);
        return this.itens[index];
    }

    public int search(String target) {
        var binarySearch = new BinarySearch();
        List<IndexItem> items = new ArrayList<>();
        IndexItem currentTarget = null;
        for (int i = 0; i < this.itens.length; i++) {
            if (this.itens[i] == null) {
                continue;
            }
            var current = new IndexItem(this.itens[i], i);
            if (current.value == target) {
                currentTarget = current;
            }
            items.add(current);
        }
        IndexItem[] sortItems = items.toArray(new IndexItem[0]);
        Arrays.sort(sortItems);
        int possition = BinarySearch.exec(currentTarget, sortItems);
        return possition == -1 ? -1 : sortItems[possition].originalIndex;
    }

    public String remove(int index) {
        validationIndex(index);
        var item = this.itens[index];
        if (item == null) {
            throw new IllegalArgumentException("Item already removed!");
        }
        this.itens[index] = null;
        return item;
    }

    public void add(String item) {
        if (nextPositionIsEmpty()) {
            this.itens[this.size] = item;
            return;
        }
        validBounds();
        this.size++;
        this.itens[this.size] = item;
    }

    // 0 1 2 3
    // A B C D
    public void add(int pos, String item) {
        validationIndex(pos);
        for (int i = this.size; i >= pos; i--) {
            this.itens[i + 1] = this.itens[i];
        }
        validBounds();
        this.itens[pos] = item;
        this.size++;
    }

    private void validBounds() {
        if (this.size + 1 > this.size() - 1) {
            throw new IllegalArgumentException("List is already full!, it's not possible add more items to the list.");
        }
    }

    private void validationIndex(int index) {
        if (index > this.size() - 1 || index < 0) {
            throw new IllegalArgumentException("Invalid Index");
        }
    }

    private boolean nextPositionIsEmpty() {
        return this.itens[this.size] == null;
    }

    public int size() {
        return this.itens.length;
    }

    /*  My Solution */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < this.size(); i++) {
            if (i >= this.size && this.itens[i] == null) {
                continue;
            }
            stringBuilder.append(this.itens[i]);
            if (i < this.size) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return "CustomArray01{" +
                "itens=" + stringBuilder.toString() +
                '}';
    }

    /*  Gpt Solution */
//    @Override
//    public String toString() {
//        if (this.itens == null || this.size() == 0) {
//            return "Gpt=CustomArray01{itens=[]}";
//        }
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("Gpt=CustomArray01{itens=");
//        stringBuilder.append(Arrays.toString(Arrays.copyOfRange(this.itens, 0, this.currentPosition + 1)));
//        stringBuilder.append("}");
//        return stringBuilder.toString();
//    }
}
