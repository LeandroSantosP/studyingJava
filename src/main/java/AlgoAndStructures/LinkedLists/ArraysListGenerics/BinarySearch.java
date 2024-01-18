package AlgoAndStructures.LinkedLists.ArraysListGenerics;

public class BinarySearch {
    static public <T extends Comparable<T>> int exec(T target, T[] list) {
        if (target == null) {
            return -1;
        }
        int low = 0;
        int high = list.length - 1;
        do {
            int middle = low + (high - low) / 2;
            T comparison = list[middle];
            int comparisonResult = comparison.compareTo(target);
            if (comparisonResult == 0) {
                return middle;
            } else if (comparisonResult > 0) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        } while (low <= high);
        return -1;
    }
}

