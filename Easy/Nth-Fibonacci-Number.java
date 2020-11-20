import java.util.*;

class Solution {
    public int solve(int n) {
        int dp[]=new int[n];
        if(n==1 || n==2)
        return 1;
        dp[0]=1;
        dp[1]=1;
        for(int i=2; i<n; i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }
}
