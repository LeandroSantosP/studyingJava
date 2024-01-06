package AlgoAndStructures.LinkedLists;

import AlgoAndStructures.LinkedLists.TestingArrays.CustomArray01;

// updated
public class Exec01 {
    public static void main(String[] args) {
        CustomArray01 arr = new CustomArray01(5);
        try {
            arr.add("Josh Doe");
            arr.add("Ca1");
            arr.add("Ca2");
            arr.add(3, "Joao1");
            arr.add(3, "Joao2");
            arr.add(3, "Joao3");
            arr.add(3, "Joao4");
            arr.add(3, "Joao5");
            arr.add(3, "Joao5");
            arr.add(4, "Joao5");
            arr.add("Ca3");
            arr.add("Ca4");
            System.out.println(arr.size());
            System.out.println(arr.search("Ca9")); // not found
//            System.out.println(arr.remove(2).equals("Ca2"));
//            System.out.println("Removed item = "+removedItem);
//            System.out.println(arr.get(1));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println(arr);
        }
    }
}
