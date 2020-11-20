import java.util.*;

class Solution {
    public int solve(String s0, String s1) {
        int dp[][]=new int[s0.length()+1][s1.length()+1];
        int res=0;
        for(int i=0; i<=s0.length(); i++)
        {
            for(int j=0; j<=s1.length(); j++)
            {
                if(i==0 || j==0)
                continue;
                if(s0.charAt(i-1)==s1.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                    res=Math.max(res,dp[i][j]);
                }
                else
                {
                    dp[i][j]=0;
                }
            }
        }
        return res;
    }
}
