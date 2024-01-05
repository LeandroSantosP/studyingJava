package AlgoAndStructures.LinkedLists;

import AlgoAndStructures.LinkedLists.TestingArrays.CustomArray01;

public class Exec01 {
    public static void main(String[] args) {
        CustomArray01 arr = new CustomArray01(10);
        try {
            arr.add("Josh Doe");
            arr.add("Ca1");
            arr.add("Ca2");
            arr.add("Ca3");
            arr.add("Ca4");
            arr.add("Ca5");
            arr.add("Ca6");
            arr.add("Ca7");
            arr.add("Ca8");
            arr.add("Ca9");
            System.out.println(arr.search("Ca9"));
            System.out.println(arr.remove(2).equals("Ca2"));
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
