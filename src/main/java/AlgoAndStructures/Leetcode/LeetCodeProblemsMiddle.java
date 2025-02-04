package AlgoAndStructures.Leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeetCodeProblemsMiddle {

   public static void main(String[] args) {
      Solution01 solution01 = new Solution01() {
      };
      int[] input = { 1, 2, 3, 4 };
      System.out.println(Arrays.toString(solution01.productExceptSelf(input)));
      /*
       * Intermediate Operations (Lazy, return a stream)
       * map(), filter(), sorted(), distinct(), limit()
       * Terminal Operations (Trigger execution, return a value or void)
       * collect(), forEach(), reduce(), count(), min(), max()
       */
   }
}

interface Solution01 {

   default public int[] productExceptSelf(int[] nums) {
      int len = nums.length;
      int[] l_arr = new int[len];
      int[] r_arr = new int[len];
      int[] res = new int[len];
      
      int l_mul = 1;
      int r_mul = 1;

      for (int i = 0; i < len; i++) {
         l_arr[i] = l_mul;
         l_mul *= nums[i];
      }

      for (int i = len - 1; i >= 0; i--) {
         r_arr[i] = r_mul;   
         r_mul *= nums[i];   
      }

      for (int i = 0; i < res.length; i++) {
         res[i] = l_arr[i] * r_arr[i];
      }

      return res;
   }
}

interface TestMy {
   public static void main(String[] args) {
      final TestMy testMy = new TestMy() {
      };
      System.out.println(testMy.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
   }

   public default int maxProfit(int[] prices) {
      int max = 0;
      int l = 0;
      int r = 1;
      while (r < prices.length) {
         if (prices[l] < prices[r]) {
            int profit = prices[r] - prices[l];
            max = Math.max(max, profit);
         } else {
            l = r;
         }
         r++;
      }
      return max;
   }

}