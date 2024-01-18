package AlgoAndStructures.Stacks;

import java.util.Arrays;

public abstract class MyStackBase<T> {
    protected T[] stack;
    protected int size = 0;

    protected MyStackBase(int capacity) {
        this.stack = (T[]) new Object[capacity];
    }

    protected MyStackBase() {
        this(10);
    }

    public int getSize() {
        return this.size;
    }

    protected void add(T item) {
        this.addCapacity();
        this.validBounds();
        if (this.stack[this.size] != null) {
            return;
        }
        this.stack[this.size] = item;
        this.size++;
    }

    protected void add(int pos, T item) {
        validationIndex(pos);
        this.addCapacity();
        for (int i = this.size; i >= pos; i--) {
            validBounds();
            this.stack[i + 1] = this.stack[i];
        }
        this.stack[pos] = item;
        this.size++;
    }

    private void addCapacity() {
        if (!this.isFull()) return;
        // could be replaced by Array.copy
        T[] newElements = (T[]) new Object[this.stack.length * 2];
        for (int i = 0; i < this.stack.length * 2; i++) {
            if (i >= this.stack.length) {
                newElements[i] = null;
                continue;
            }
            newElements[i] = this.stack[i];
        }
        this.stack = newElements;
    }

    private void validationIndex(int index) {
        if (index > this.stack.length - 1 || index < 0) {
            throw new IllegalArgumentException("Invalid Index");
        }
    }

    protected void validBounds() {
        if (this.size > this.stack.length) {
            throw new IllegalArgumentException("List is already full!, it's not possible add more items to the list.");
        }
    }

    protected boolean isFull() {
        return this.size + 1 >= this.stack.length;
    }

    public int getCapacity() {
        return this.stack.length;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public String toString() {
        System.out.println(Arrays.toString(this.stack));

        if (this.stack == null || this.size == 0) {
            return "Gpt=CustomArray01{itens=[]}";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Gpt=CustomArray01{itens=");
        stringBuilder.append(Arrays.toString(Arrays.copyOfRange(this.stack, 0, this.size)));
        stringBuilder.append("}");
        stringBuilder.append(" capacity: "+this.getCapacity()+ " size:" +this.getSize());
        return stringBuilder.toString();
    }
}
