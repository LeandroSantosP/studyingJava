package AlgoAndStructures.LinkedLists.ArrayListString;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearchSec {
   private static ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 23, 55, 67, 98, 102, 109));

   public static void main(String[] args) {
      var binarySearchSec = new BinarySearchSec();
      Integer[] array = arr.toArray(new Integer[0]);
      int idx = binarySearchSec.exec(98, array);
      int idx2 = binarySearchSec.exec(23, array, 0, array.length-1);
      System.out.println(idx2);
   }

   private <T extends Comparable<T>> int exec(T target, T[] arr) {
      int left = 0;
      int right = arr.length - 1;
      do {
         int middle = left + (right - left) / 2;
         int compere = arr[middle].compareTo(target);
         if (compere == 0) {
            return middle;
         } else if (compere > 0) {
            right = middle - 1;
         } else {
            left = middle + 1;
         }
      } while (left <= right);
      return -1;
   }

   private <T extends Comparable<T>> int exec(T target, T[] arr, int left, int right) {
      if (left > right) {
         return - 1;
      }
      int middle = left + (right - left) / 2;
      int compare = arr[middle].compareTo(target);
      if (compare == 0) {
         return middle; // Element found
     } else if (compare > 0) {
         return exec(target, arr, left, middle - 1); 
     } else {
         return exec(target, arr, middle + 1, right); 
     }
   }
}
