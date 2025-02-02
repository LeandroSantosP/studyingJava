package AlgoAndStructures.Leetcode;

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