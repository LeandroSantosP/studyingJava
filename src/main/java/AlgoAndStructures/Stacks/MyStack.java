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

    public T stackOut() {
        if (this.isEmpty()) {
            return null;
        }
        var popped = this.stack[this.size - 1];
        // return item afterwards decrease size.
        this.stack[--this.size] = null;
        return popped;
    }
}
