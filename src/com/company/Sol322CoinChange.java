package com.company;

import java.util.Arrays;

/*
You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
You may assume that you have an infinite number of each kind of coin.
Example 1:
Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1
Example 2:
Input: coins = [2], amount = 3
Output: -1
Example 3:
Input: coins = [1], amount = 0
Output: 0
Constraints:
        1 <= coins.length <= 12
        1 <= coins[i] <= 2^31 - 1
        0 <= amount <= 10^4*/

/*    Sol322CoinChange sol = new Sol322CoinChange();
    System.out.print(sol.coinChange(new int[] {1,2,5}, 11));*/
public class Sol322CoinChange {
    public int coinChange(int[] coins, int amount){
        if(coins == null || coins.length == 0)
            return 0;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for(int i = 1; i < dp.length; i ++) {
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j])
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
            }
            printArray(dp);
        }
        if(dp[amount]<=amount)
            return dp[amount];
        else
            return -1;
    }

    public void printArray(int[] dp){
        for(int i = 0; i < dp.length; i++)
            System.out.print(dp[i] + " ");
        System.out.println();
    }

}
