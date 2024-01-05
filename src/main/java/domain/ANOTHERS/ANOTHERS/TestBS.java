package domain.ANOTHERS.ANOTHERS;

import AlgoAndStructures.LinkedLists.TestingArrays.BinarySearch;

public class TestBS {
    public static void main(String[] args) {
        Integer[] myArrayA = {1, 2, 10, 23, 42, 122};
        System.out.println(BinarySearch.exec(42, myArrayA));

        String[] myArrayB = {"apple", "banana", "orange", "pear", "grape"};
        System.out.println(BinarySearch.exec("orange", myArrayB));
    }
}

