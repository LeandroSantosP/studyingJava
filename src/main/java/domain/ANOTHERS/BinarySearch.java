package domain.ANOTHERS;

public class BinarySearch {
    public static void main(String[] args) {
        int[] myArrayA = {1, 2, 10, 23, 42, 122};
        System.out.println(search(42, myArrayA));
    }

    static private String search(int target, int[] list) {
        int i_low = 0;
        int i_high = list.length - 1;
        while (i_low < i_high) {
            int i_middle = (int) Math.floor(i_low + i_high) / 2;
            int current = list[i_middle];

            if (current == target) {
                return "Founded";
            } else if (current > target) {
                i_high = i_middle - 1;
            } else {
                i_low = i_middle + 1;
            }
        }
        return "Not found";
    }
}
