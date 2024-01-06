package AlgoAndStructures.LinkedLists.TestingArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomArray01 {
    private String[] itens;
    private int amount = 0;

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

    public IndexItem search(String target) {
        var binarySearch = new BinarySearch();
        List<IndexItem> items = new ArrayList<>();
        IndexItem currentTarget = null;
        for (int i = 0; i < this.itens.length; i++) {
            if (this.itens[i] == null) {
                continue;
            }
            var current = new IndexItem(this.itens[i], i);
            if (current.value.equals(target)) {
                currentTarget = current;
            }
            items.add(current);
        }
        IndexItem[] sortItems = items.toArray(new IndexItem[0]);
        Arrays.sort(sortItems);
        int possition = BinarySearch.exec(currentTarget, sortItems);
        return possition == -1 ? null : sortItems[possition];
    }

    public String remove(int pos) {
        validationIndex(pos);
        var item = this.itens[pos];
        for (int i = pos; i < this.amount; i++) {
            if (i >= this.itens.length) {
                break;
            }
            this.itens[i] = this.itens[i + 1];
        }
        this.amount--;
        this.itens[this.amount] = null;
        return item;
    }

    public String remove(String target) {
        var item = this.search(target);
        if (item == null) throw new IllegalArgumentException("Element not found for removal!");
        this.remove(item.originalIndex);
        return item.value;
    }

    public void add(String item) {
        this.addCapacity();
        if (nextPositionIsEmpty()) {
            this.itens[this.amount] = item;
            return;
        }
        this.validBounds();
        this.amount++;
        this.itens[this.amount] = item;
    }

    // 0 1 2 3
    // A B C D
    public void add(int pos, String item) {
        validationIndex(pos);
        for (int i = this.amount; i >= pos; i--) {
            validBounds();
            this.itens[i + 1] = this.itens[i];
        }
        this.itens[pos] = item;
        this.amount++;
    }

    private void addCapacity() {
        if (!isFull()) return;
        // could be replace by Array.copy
        String[] newElements = new String[this.itens.length * 2];
        for (int i = 0; i < this.itens.length * 2; i++) {
            if (i >= this.itens.length) {
                newElements[i] = null;
                continue;
            }
            newElements[i] = this.itens[i];
        }
        this.itens = newElements;
    }

    private boolean isFull() {
        return this.amount + 1 == this.itens.length;
    }

    private void validBounds() {
        if (this.amount + 1 > this.itens.length - 1) {
            throw new IllegalArgumentException("List is already full!, it's not possible add more items to the list.");
        }
    }

    private void validationIndex(int index) {
        if (index > this.itens.length - 1 || index < 0) {
            throw new IllegalArgumentException("Invalid Index");
        }
    }

    private boolean nextPositionIsEmpty() {
        return this.itens[this.amount] == null;
    }

    /*  My Solution */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < this.itens.length; i++) {
            if (i >= this.amount && this.itens[i] == null) {
                continue;
            }
            stringBuilder.append(this.itens[i]);
            if (i < this.amount) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return "CustomArray01{" +
                "itens=" + stringBuilder.toString() +
                '}' + ", size: " + this.itens.length + ", amount: " + this.amount;
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
