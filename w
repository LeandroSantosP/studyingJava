[1mdiff --git a/src/main/java/AlgoAndStructures/Leetcode/LeetCodeProblems.java b/src/main/java/AlgoAndStructures/Leetcode/LeetCodeProblems.java[m
[1mindex 96fb4d9..87784f5 100644[m
[1m--- a/src/main/java/AlgoAndStructures/Leetcode/LeetCodeProblems.java[m
[1m+++ b/src/main/java/AlgoAndStructures/Leetcode/LeetCodeProblems.java[m
[36m@@ -81,20 +81,22 @@[m [mclass BestTimetoBuyAndSellStock {[m
       for (int sellPoiter = 1; sellPoiter < prices.length; sellPoiter++) {[m
          int current = prices[sellPoiter]; // get the current seller[m
          int profit = current - buyPointer; // get the profit of the between the current and the last lowest[m
[31m-         [m
[31m-          [m
[31m-         // Math has the  effect of the If[m
[31m-         /* if (profit > max) {[m
[31m-            max = profit; [m
[31m-         } */[m
[32m+[m
[32m+[m[32m         // Math has the effect of the If[m
[32m+[m[32m         /*[m
[32m+[m[32m          * if (profit > max) {[m
[32m+[m[32m          * max = profit;[m
[32m+[m[32m          * }[m
[32m+[m[32m          */[m
          max = Math.max(max, profit);[m
[31m-         [m
[31m-          [m
[31m-         // Math has the  effect of the If[m
[32m+[m
[32m+[m[32m         // Math has the effect of the If[m
[32m+[m[32m         /*[m
[32m+[m[32m          * if (buyPointer < current) {[m
[32m+[m[32m          * buyPointer = current;[m
[32m+[m[32m          * }[m
[32m+[m[32m          */[m
          buyPointer = Math.min(buyPointer, current);[m
[31m-         /* if (buyPointer < current) {[m
[31m-            buyPointer = current;[m
[31m-         } */[m
       }[m
 [m
       return max;[m
