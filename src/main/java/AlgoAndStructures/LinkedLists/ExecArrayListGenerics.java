package AlgoAndStructures.LinkedLists;

import AlgoAndStructures.LinkedLists.ArraysListGenerics.CustomArray02;

public class ExecArrayListGenerics {
    public static void main(String[] args) {
        CustomArray02<Integer> arr = new CustomArray02<>(5);
        try {
            arr.add(1);
            arr.add(1);
            arr.add(222);
            arr.add(4, 10);
            arr.remove(1);
            System.out.println(arr.search(222).getValue());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println(arr);
        }
    }
}
