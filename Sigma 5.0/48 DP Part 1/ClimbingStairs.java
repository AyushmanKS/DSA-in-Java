import java.util.Arrays;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        if(n<0) return 0;
        if(n==0) return 1;

        return climbStairs(n-1) + climbStairs(n-2);
    }

    public static int memorization(int n, int ways[]) {
        if(n<0) return 0;
        if(n==0) return 1;

        if(ways[n] != -1) return ways[n];

        ways[n] = memorization(n-1, ways) + memorization(n-2, ways);
        return ways[n];
    }

    public static int tabulation(int n, int ways[]) {
        int dp[] = new int[n+1];
        dp[0] = 1;

        for(int i=1; i<=n; i++) {
            if(i==1) {
                dp[i] = dp[i-1];
            }
            else {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String args[]) {
        int n = 5;
        System.out.println(climbStairs(n));

        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
        System.out.println(memorization(n, ways));

        System.out.println(tabulation(n, ways));
    }
}
