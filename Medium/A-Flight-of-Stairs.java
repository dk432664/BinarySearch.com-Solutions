import java.util.*;

class Solution {
    public int solve(int n) {
        if(n==1 )
        return 1;
        int dp[]=new int[n];
        dp[0]=1;
        dp[1]=2;
        int pow=1000000007;
        for(int i=2; i<n; i++)
        {
            dp[i]=dp[i-1]%pow+dp[i-2]%pow;
        }
        return dp[n-1]%pow;
    }
}
