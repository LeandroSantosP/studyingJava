package AlgoAndStructures.LinkedLists;

import AlgoAndStructures.LinkedLists.TestingArrays.CustomArray01;

// updated
public class Exec01 {

    public static void main(String[] args) {
        CustomArray01 arr = new CustomArray01(5);
        try {
            arr.add("Josh Doe 0");
            arr.add("Joao1");
            arr.add("Joao2");
            arr.add("Joao3");
            arr.add("Joao4");
            arr.add("Joao5");
            arr.add("Joao6");
            arr.add("Joao7");
            arr.add("Joao8");
            arr.add("Joao9");
            arr.add("Joao10");
            System.out.println(arr.remove(1).equals("Joao1"));
            System.out.println(arr.remove("Joao10").equals("Joao10"));
            System.out.println(arr.search("Ca2") == null); // not found
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println(arr);
        }
    }
}
