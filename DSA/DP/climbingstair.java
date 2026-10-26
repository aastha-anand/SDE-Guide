package DSA.DP;

public class climbingstair {
    private static int[] dp;
    public static void main(String[] args) {
        int n = 6;
        dp = new int[n + 1];
        
        System.out.println(climbStairs(n));         // Pure recursion
        System.out.println(climbStairs1(n));        // Memoized recursion
        System.out.println(climbStairs2(n));        // Tabulation (1 or 2 steps)
        
        int[] ways = new int[n + 1];
        System.out.println(climbStairs3(n, ways, 3)); // Tabulation with k jumps (k=3)
    }

    static int climbStairs(int n) {
        if (n <= 0) return 0; // Standard convention: 0 steps = 0 ways, or handle base case safely
        if (n == 1) return 1;
        return climbStairs(n - 1) + climbStairs(n - 2); // Fixed to call climbStairs
    }

    static int climbStairs1(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (dp[n] != 0) return dp[n];
     
        dp[n] = climbStairs1(n - 1) + climbStairs1(n - 2);
        return dp[n]; 
    }

    static int climbStairs2(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    static int climbStairs3(int n, int[] ways, int k) {
        if (n <= 0) return 0;
        ways[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k && i - j >= 0; j++) {
                ways[i] += ways[i - j];
            }
        }
        return ways[n];
    }
}