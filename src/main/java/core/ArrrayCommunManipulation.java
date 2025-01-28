package core;

import java.util.Arrays;

public class ArrrayCommunManipulation {

   public static void main(String[] args) {
      var ex = new ArrrayCommunManipulation();
      ex.palidrome();
      ex.reverseArray();
      ex.removeDuplicatesFromAnArray();
   }

   private void palidrome() {
      final int[] arr = { 1, 2, 4, 5, 6, 5, 4, 2, 1 };
      boolean isPalindrome = true;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] != arr[arr.length - i - 1]) {
            isPalindrome = false;
            break;
         }
      }
      System.out.println("Is An Palidrom?: " + String.valueOf(isPalindrome));
   }

   public void reverseArray() {
      int[] arr = { 23, 2, 5, 98, 21 };
      for (int i = 0; i < arr.length/2; i++) {
         int temp = arr[i];
         arr[i] = arr[arr.length-1-i];
         arr[arr.length-1-i] = temp;
      }
      System.out.println("Reversed Array: "+ Arrays.toString(arr));
   }
   
   public void removeDuplicatesFromAnArray() {
      int[] arr = { 23, 2, 5, 23, 23, 98, 21 };
      int[] uniqueArr = new int[arr.length];
      int j = 0;
      for (int i = 0; i < arr.length - 1; i++) {
          if (arr[i] != arr[i + 1]) {
              uniqueArr[j++] = arr[i];
          }
      }
      uniqueArr[j++] = arr[arr.length - 1];
      System.out.println("Unique Array: "+ Arrays.toString(Arrays.copyOf(uniqueArr, j)));
   }
}
