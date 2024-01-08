package AlgoAndStructures.Stacks;

public class MyStack<T> extends MyStackBase<T> {
    public MyStack(int capacity) {
        super(capacity);
    }

    public MyStack() {
        super();
    }

    public T top() {
        if (this.isEmpty()) {
            return null;
        }
        return this.stack[this.size - 1];
    }

    public void stackIn(T item) {
        super.add(item);
    }
}
