package DSA.DP;
import java.util.*;
public class knapsack {
    public static void main(String[] args) {
        int[] wt = { 1, 2, 3, 4, 5 };
        int[] val = { 10, 15, 45, 30, 14 };
        int W = 7;
        int n=wt.length;
        int[][]dp=new int[n+1][W+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(knapsack(wt, val, W,n - 1));
        System.out.println(knapsack1(wt, val, W, n, dp));
        System.out.println(knapsack2(wt, val, W));
    }

    static int knapsack2(int[] wt, int[] val, int W){
        int n=wt.length;
        if(n==0 || W==0) return 0;

        int[][] dp=new int[n+1][W+1];
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=W;j++){
                if(wt[i-1]<=j){
                     dp[i][j]=Math.max((val[i-1]+dp[i-1][j-wt[i-1]]),dp[i-1][j]);
                }
                else{
                     dp[i][j]=dp[i-1][j];
                }
            }
        }

        return dp[n][W];
    }

    static int knapsack1(int[]wt,int[]val,int W, int n, int[][] dp){
               
        if (n == 0 || W == 0)
            return 0;

        if(dp[n][W]!=-1) 
            return dp[n][W];
        

        if (wt[n-1] > W) {
            dp[n][W]= knapsack1(wt, val, W, n - 1,dp );
            return dp[n][W];
        } else {
            int inProfit = val[n-1]+knapsack1(wt, val, W - wt[n-1], n - 1, dp);
            int exProfit = knapsack1(wt, val, W, n - 1, dp);
            dp[n][W]=Math.max(inProfit, exProfit);
            return dp[n][W];
        }
        
    }
    static int knapsack(int[] wt, int[] val, int W, int i) {
        if (i < 0 || W == 0)
            return 0;
        if (wt[i] > W) {
            return knapsack(wt, val, W, i - 1);
        } else {
            int inProfit = val[i]+knapsack(wt, val, W - wt[i], i - 1);
            int exProfit = knapsack(wt, val, W, i - 1);
            return Math.max(inProfit, exProfit);
        }
    }

}
