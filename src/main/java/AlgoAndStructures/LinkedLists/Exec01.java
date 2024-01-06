package AlgoAndStructures.LinkedLists;

import AlgoAndStructures.LinkedLists.TestingArrays.CustomArray01;

// updated
public class Exec01 {
    public static void main(String[] args) {
        CustomArray01 arr = new CustomArray01(5);
        try {
            arr.add("Josh Doe 1");
            arr.add(1, "Joao1");
            arr.add(2, "Joao2");
            arr.add(3, "Joao3");
            arr.add(3, "Joao4");
            arr.add(3, "Joao5");
            arr.add(3, "Joao5");
            arr.add(4, "Joao5");
            arr.add("Joao 6");
            arr.add("Joao 7");
            System.out.println(arr.size());
            System.out.println(arr.remove(1).equals("Joao1"));
//            System.out.println(arr.search("Ca2") == -1); // not found
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println(arr);
        }
    }
}
