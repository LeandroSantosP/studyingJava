package AlgoAndStructures.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* ADD A COMMENT */
/* ADD A COMMENT - 2 */

public class LeetCodeProblems {
   public static void main(String[] args) {
      int[] s = { 1, 0, 0, 3, 4 };
      new LeetCodeProblems().moveZeroes(s);
      System.out.println(Arrays.toString(s));
   }
   
   //13

   public int[] twoSum(int[] nums, int target) {
      int[] result = new int[2];

      HashMap<Integer, Integer> mrr = new HashMap<>();

      for (int i = 0; i < nums.length; i++) {
         var complement = target - nums[i]; 
         if (mrr.containsKey(complement)) {
            result[0] = i;
            result[1] = mrr.get(complement);
            break;
         }
         mrr.put(nums[i], i);
      }

      return result;
   }

   public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      int max = candies[0];

      for (int num : candies) {
         if (num > max) {
            max = num;
         }
      }

      ArrayList<Boolean> kidsWithGrestestCaniies = new ArrayList<>();

      for (int i = 0, l = candies.length; i < l; i++) {
         int crr = candies[i];
         if (crr + extraCandies >= max) {
            kidsWithGrestestCaniies.add(true);
         } else {
            kidsWithGrestestCaniies.add(false);
         }
      }
      return kidsWithGrestestCaniies;
   }

   public void moveZeroes(int[] nums) {
      // tracks where the next no-zero element should be placed.
      int last_no_zero_idx = 0;
      for (int num : nums) {
         /*
          * So, this part of the code shifts all non-zero elements to the front of the
          * array.
          */
         // if is an zero that no problem because if the next elements is an no-zero
         // than they will the replace by the next value
         if (num != 0) {
            nums[last_no_zero_idx] = num;
            last_no_zero_idx++;
         }
      }

      while (last_no_zero_idx < nums.length) {
         nums[last_no_zero_idx++] = 0;
      }
   }

   public int[] runningSum(int[] nums) {
      int n = nums.length;
      var runningSum = new int[n];
      runningSum[0] = nums[0];

      for (int i = 1; i < n; i++) {
         runningSum[i] = runningSum[i - 1] + nums[i];
      }

      return runningSum;
   }

   public int findClosestNumber(int[] nums) {
      int closest = nums[0];
      for (int num : nums) {
         var closest_abs = Math.abs(closest);
         var curr_abs = Math.abs(num);
         if (curr_abs < closest_abs) {
            closest = num;
         }
         if (num == closest_abs) {
            closest = curr_abs;
         }
      }
      return closest;
   }

   public String mergeAlternately(String word1, String word2) {
      StringBuilder merged = new StringBuilder();

      for (int j = 0; j < word1.length() || j < word2.length(); j++) {
         if (j < word1.length()) {
            merged.append(word1.charAt(j));
         }
         if (j < word2.length()) {
            merged.append(word2.charAt(j));
         }
      }
      return merged.toString();
   }
}
