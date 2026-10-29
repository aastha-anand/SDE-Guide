package DSA.DP;

public class targetSum {
    public static void main(String args[]){
        int[] cal={4,2,7,1,3};
        int targetSum=100;
        System.out.println("Target sum subset: "+target(cal,targetSum));
    }
    static boolean  target(int[]cal,int targetSum){
        int n=cal.length;
        boolean[][] dp=new boolean[targetSum+1][n+1];
        for(int i=0;i<=n;i++){
            dp[0][i]=true;
        }
        for(int i=1;i<=targetSum;i++){
            for(int j=1;j<=n;j++){
                dp[i][j]=dp[i][j-1];

                if(cal[j-1]<=i){
                    dp[i][j]=dp[i][j]||dp[i-cal[j-1]][j-1];
                }
            }
        }
        return dp[targetSum][n];
    }
}
