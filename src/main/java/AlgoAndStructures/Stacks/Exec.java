package AlgoAndStructures.Stacks;

public class Exec {
    public static void main(String[] args) {
        // LIFO = Last in Fist out
        MyStack<String> stack = new MyStack<>();
        for (int i = 1; i <= 10; i++) {
            stack.stackIn("Stack " + (i));
        }
        System.out.println(stack.stackOut());
//        System.out.println(stack.top());
//        System.out.println(stack.isEmpty());
        System.out.println(stack);
    }
}
