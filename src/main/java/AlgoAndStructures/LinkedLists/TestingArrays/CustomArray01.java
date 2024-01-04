package AlgoAndStructures.LinkedLists.TestingArrays;

import java.util.Arrays;

public class CustomArray01 {
    private String[] itens;
    private int currentPosition = 0;

    public CustomArray01(int capacity) {
        if (capacity < 0) {
            throw new RuntimeException("quantity must be greater than 0");
        }
        this.itens = new String[capacity];
    }

    private void validationIndex(int index) {
        if (index > this.size() - 1) {
            throw new RuntimeException("Invalid Index");
        }
    }

    public String get(int index) {
        validationIndex(index);
        return this.itens[index];
    }

    private boolean nextPositionIsEmpty() {
        return this.itens[this.currentPosition] == null;
    }


    private void validBounds() {
        if (this.currentPosition + 1 > this.size() - 1) {
            throw new RuntimeException("List is already full!, it's not possible add more items to the list.");
        }
    }

    public String remove(int index) {
        validationIndex(index);
        var item = this.itens[index];
        this.itens[index] = null;
        return item;
    }

    public void add(String item) {
        if (nextPositionIsEmpty()) {
            this.itens[this.currentPosition] = item;
            return;
        }
        validBounds();
        this.currentPosition++;
        this.itens[this.currentPosition] = item;
    }

    public int size() {
        return this.itens.length;
    }

    /*  My Solution */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < this.itens.length; i++) {
            if (i >= this.currentPosition && this.itens[i] == null) {
                continue;
            }
            stringBuilder.append(this.itens[i]);
            if (i < this.currentPosition) {
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
//        if (this.itens == null || this.itens.length == 0) {
//            return "Gpt=CustomArray01{itens=[]}";
//        }
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("Gpt=CustomArray01{itens=");
//        stringBuilder.append(Arrays.toString(Arrays.copyOfRange(this.itens, 0, this.currentPosition + 1)));
//        stringBuilder.append("}");
//        return stringBuilder.toString();
//    }
}
