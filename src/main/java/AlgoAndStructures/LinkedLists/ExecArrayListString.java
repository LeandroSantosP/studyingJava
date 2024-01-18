package AlgoAndStructures.LinkedLists;

import java.util.ArrayList;

public class ExecArrayListString {
    ArrayList<String> list;

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(10);
        list.add("John Doe 00");
        list.add("John Doe 01");
        list.add("John Doe 02");
        list.add("John Doe 01");

        System.out.println(list.indexOf("John Doe 01")); // return fist index or -1;
        System.out.println(list.lastIndexOf("John Doe 01")); // return last index or -1;

        System.out.println(list.contains("John Doe 02")); // return the boolean.
        System.out.println(list.remove("John Doe 00")); // return index or -1;

        System.out.println(list.set(0, "John Doe updated 00")); // about writes a word of a given index.
        System.out.println(list.get(0)); // return the element;

        System.out.println(list.size());
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
