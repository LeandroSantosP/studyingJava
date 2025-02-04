package AlgoAndStructures.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* ADD A COMMENT */
/* ADD A COMMENT - 2 */

class RomanToInteger {

	private static final Map<Character, Integer> romanMap = new HashMap<>();

	static {
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
	};

	public int romanToInt(String s) {
		int total = 0;

		for (int i = 0, l = s.length(); i < l; i++) {
			int current = romanMap.get(s.charAt(i));
			if (i + 1 < l && current < romanMap.get(s.charAt(i + 1))) {
				total -= current;
				continue;
			}
			total += current;
		}

		return total;
	}

	public int romanToIntTwo(String s) {
		int total = 0;
		int prev = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			int current = romanMap.get(s.charAt(i));
			if (current < prev) {
				total -= current;
			} else {
				total += current;
			}
			prev = current;
		}
		return total;
	}
}

interface IsSubsequence {
	public default boolean isSubsequence(String s, String t) {
		int i = 0;
		int j = 0;
		if (s == "") {
			return true;
		}
		while (j < t.length()) {
			if (s.charAt(i) == t.charAt(j)) {
				i++;
				if (i == s.length()) {
					return true;
				}
			}
			j++;
		}
		return false;
	}
}

class BestTimetoBuyAndSellStock {

	public int maxProfit(int[] prices) {
		/*
		 * for (int i = 1; i < prices.length; i++) {
		 * // [7. 1, 4]
		 * if (prices[i] < buy) {
		 * buy = prices[i];
		 * } else if (prices[i] - buy > max) {
		 * max = prices[i] - buy;
		 * }
		 * }
		 */

		int L = 0;
		int R = 1;
		int max = 0;

		while (R < prices.length) {
			int sellPoiter = prices[R];
			if (prices[L] < sellPoiter) {
				int profit = sellPoiter - prices[L];
				max = Math.max(max, profit);
			} else {
				L = R;
			}
			R++;
		}
		return max;
	}
}

class InnerLeetCodeProblems {
	public String longestCommonPrefix(String[] strs) {
		String ref = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while (!strs[i].startsWith(ref)) {
				ref = ref.substring(0, ref.length() - 1);
			}
		}
		return ref;
	}
}

class SummryRanges {
	static public List<String> summaryRanges(int[] nums) {
		List<String> summary = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int start = nums[i];
			while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {//
				i++;
			}
			if (start == nums[i]) {
				summary.add(Integer.toString(nums[i]));
			} else {
				summary.add(start + "->" + Integer.toString(nums[i]));
			}
		}
		return summary;
	}
}

public class LeetCodeProblemsEasly {
	public static void main(String[] args) {

		int[] in = { 0, 2, 3, 4, 6, 8, 9 };
		System.out.println(SummryRanges.summaryRanges(in));

		int[] s = { 1, 0, 0, 3, 4 };
		String[] inp = { "dog", "racecar", "car" };
		var innerLeetCodeProblems = new InnerLeetCodeProblems();
		// System.out.println(new BestTimetoBuyAndSellStock().maxProfit(new int[] { 7,
		// 1, 5, 3, 6, 4 }));
		
	}

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
