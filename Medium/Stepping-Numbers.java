import java.util.*;
class Solution {
    public int solve(int n) {
    int mod=1000000007;
    int dp[][] = new int[n+1][10]; 
     if (n == 1) 
     return 10; 
      for (int j = 0; j <= 9; j++) 
            dp[1][j] = 1; 
       for (int i = 2; i <= n; i++) { 
            for (int j = 0; j <= 9; j++) { 
            if (j == 0) 
                    dp[i][j] = dp[i - 1][j + 1]%mod; 
           else if (j == 9) 
                    dp[i][j] = dp[i - 1][j - 1]%mod; 
           else
                    dp[i][j] = (dp[i - 1][j - 1] +  
                               dp[i - 1][j + 1])%mod; 
            } 
        } 
       int sum = 0; 
       
        for (int j = 1; j <= 9; j++) 
            sum =(int)(sum%mod + dp[n][j]%mod)%mod; 
        return (int)sum%1000000007;     
    }
}
