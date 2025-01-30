package AlgoAndStructures.Leetcode;

import java.util.Arrays;

public class LeetCodeProblems {
   public static void main(String[] args) {
      int[] s = { 1, 2, 3, 4 };
      System.out.println("RES: " + Arrays.toString(new LeetCodeProblems().runningSum(s)));
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
