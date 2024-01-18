package AlgoAndStructures.LinkedLists.ArraysListGenerics;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomArray02<T> {
    private T[] items;
    private int amount = 0;
    public CustomArray02(int capacity) {
        // reflection
        if (capacity < 0) {
            throw new IllegalArgumentException("quantity must be greater than 0");
        }
        this.items = (T[]) Array.newInstance(Object.class, capacity);
    }

    public T get(int index) {
        validationIndex(index);
        return this.items[index];
    }

    public IndexItem<T> search(T target) {
        List<IndexItem<T>> items = new ArrayList<>();
        IndexItem<T> currentTarget = null;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] == null) {
                continue;
            }
            var current = new IndexItem<>(this.items[i], i);
            if (current.getValue().equals(target)) {
                currentTarget = current;
            }
            items.add(current);
        }
        IndexItem<T>[] sortItems = items.toArray(new IndexItem[0]);
        Arrays.sort(sortItems);
        int position = BinarySearch.exec(currentTarget, sortItems);
        return position == -1 ? null : sortItems[position];
    }

    public T remove(int pos) {
        validationIndex(pos);
        var item = this.items[pos];
        for (int i = pos; i < this.amount; i++) {
            if (i >= this.items.length) {
                break;
            }
            this.items[i] = this.items[i + 1];
        }
        this.amount--;
        this.items[this.amount] = null;
        return item;
    }

    public T remove(T target) {
        var item = this.search(target);
        if (item == null) throw new IllegalArgumentException("Element not found for removal!");
        this.remove(item.originalIndex);
        return (T) item.getValue();
    }

    public void add(T item) {
        this.addCapacity();
        if (nextPositionIsEmpty()) {
            this.items[this.amount] = item;
            return;
        }
        this.validBounds();
        this.amount++;
        this.items[this.amount] = item;
    }

    // 0 1 2 3
    // A B C D
    public void add(int pos, T item) {
        validationIndex(pos);
        for (int i = this.amount; i >= pos; i--) {
            validBounds();
            this.items[i + 1] = this.items[i];
        }
        this.items[pos] = item;
        this.amount++;
    }

    private void addCapacity() {
        if (!isFull()) return;
        // could be replaced by Array.copy
        T[] newElements = (T[]) new Object[this.items.length * 2];
        for (int i = 0; i < this.items.length * 2; i++) {
            if (i >= this.items.length) {
                newElements[i] = null;
                continue;
            }
            newElements[i] = this.items[i];
        }
        this.items = newElements;
    }

    private boolean isFull() {
        return this.amount + 1 == this.items.length;
    }

    private void validBounds() {
        if (this.amount + 1 > this.items.length - 1) {
            throw new IllegalArgumentException("List is already full!, it's not possible add more items to the list.");
        }
    }

    private void validationIndex(int index) {
        if (index > this.items.length - 1 || index < 0) {
            throw new IllegalArgumentException("Invalid Index");
        }
    }

    private boolean nextPositionIsEmpty() {
        return this.items[this.amount] == null;
    }

    /*  My Solution */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < this.items.length; i++) {
            if (i >= this.amount && this.items[i] == null) {
                continue;
            }
            stringBuilder.append(this.items[i]);
            if (i < this.amount) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return "CustomArray01{" + "itens=" + stringBuilder.toString() + '}' + ", size: " + this.items.length + ", amount: " + this.amount;
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
