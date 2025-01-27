package test;


import core.Readability;
import core.Scrabble;;

public class Main {
    public static void main(String[] args) {
        // Readability.exec();
        new Scrabble().exec();
        print_max_sub_arr();
    }

    static void print_max_sub_arr() {
        int[] arr = { -2, 7, -3, 4 };
        int max_sum = Integer.MIN_VALUE;
        int cur_sum = 0;
        for (int i = 0; i < arr.length; i++) {
           cur_sum += arr[i];
           max_sum = Math.max(max_sum, cur_sum);
           if (cur_sum < 0) {
              cur_sum = 0;
           }
        }
        System.out.println(max_sum);
     }
}