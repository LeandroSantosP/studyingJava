package domain.ANOTHERS;

public class BinarySearch {

    private record Person(String name, Integer age) {
    }

    public static void main(String[] args) {
        Integer[] myArrayA = {1, 2, 10, 23, 42, 122};
        System.out.println(search(42, myArrayA));

        String[] myArrayB = {"apple", "banana", "orange", "pear", "grape"};
        System.out.println(search("orange", myArrayB));
    }

    static private <T extends Comparable<T>> String search(T target, T[] list) {
        int i_low = 0;
        int i_high = list.length - 1;
        do {
            int i_middle = i_low + (i_high - i_low) / 2;
            T comparison = list[i_middle];
            int comparisonResult = comparison.compareTo(target);
            if (comparisonResult == 0) {
                return "Found";
            } else if (comparisonResult > 0) {
                i_high = i_middle - 1;
            } else {
                i_low = i_middle + 1;
            }
        } while (i_low < i_high);
        if (list[i_low].compareTo(target) == 0 || list[i_high].compareTo(target) == 0) {
            return "Found";
        }
        return "Not found";
    }

}

