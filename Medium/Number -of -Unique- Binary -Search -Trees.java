import java.util.*;
class Solution {
    public int solve(int n) {
    long dp[] = new long[n + 2]; 
    long mod=1000000007;
    dp[0] = 1; 
    dp[1] = 1; 
    for (int i = 2; i <= n; i++)  
        { 
            dp[i] = 0; 
            for (int j = 0; j < i; j++)  
            { 
            dp[i] =(dp[i]%mod) +((dp[j]%mod)  
                    *dp[i - j - 1]%mod)%mod; 
            } 
        } 
  return (int)(dp[n]%mod);     
    }
}
