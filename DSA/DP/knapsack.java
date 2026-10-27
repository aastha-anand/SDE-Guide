package DSA.DP;

public class knapsack {
    public static void main(String[] args) {
        int[] wt = { 1, 2, 3, 4, 5 };
        int[] val = { 10, 15, 45, 30, 14 };
        int W = 7;
        System.out.println(knapsack(wt, val, W, wt.length - 1));
        System.out.println(knapsack1(wt, val, W));
    }


    static int knapsack1(int[]wt,int[]val,int W){
        int n=wt.length;
        int[][]dp=new int[n+1][W+1];
        
        
        for(int i=0;i<=n;i++){
            for(int w=0;w<=W;w++)
            {
                if(i==0 || w==0){
                    dp[i][w]=0;
                }
                else if(wt[i-1]<=w){
                    int includeProfit=val[i-1]+dp[i-1][w-wt[i-1]];
                    int excludeProfit=dp[i-1][w];

                    dp[i][w]=Math.max(includeProfit,excludeProfit);
                }
                else{
                    dp[i][w]=dp[i-1][w];
                }
            }
            
        }
        return dp[n][W];
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
