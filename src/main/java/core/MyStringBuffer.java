package core;

public class MyStringBuffer {
   static private char[] charArrayHelloWord = { 'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!' };

   public static void main(String[] args) {
      StringBuffer s = new StringBuffer();
      s.append(charArrayHelloWord);
      s.append(" Leandro");
      s.deleteCharAt(5); // remove the comma
      s.delete(6, 13); // remove 'World! 'from the string
      s.reverse();
      s.length();
      s.charAt(0);
      s.substring(0);
      s.reverse();// unreverse
      s.insert(5, ","); // insert the comma back
      System.out.println(s.substring(7, 8));
      System.out.println(s);
      max_sub_arr();
      // System.out.println(s.toString()); // Corvert back to String
   }

  static void max_sub_arr() {
      int[] arr = { -2, 7, -3, 4 };
      int max_sum = Integer.MIN_VALUE;
      int cur_sum = 0;
      for (int i = 0; i < arr.length; i++) {
         cur_sum += arr[i];
         max_sum = Math.max(max_sum, cur_sum);
         if (cur_sum < 0 ) {
            cur_sum = 0;
         }
      }
      System.out.println(max_sum);
   }
}
