import java.util.*;

class Solution {
    public int solve(String s) {
    if(s==null || s.length()==0)
    return 0;
    int[][] dp = new int[s.length()][s.length()];
    for (int i=s.length()-1; i>=0; i--) {
    dp[i][i] = 1;
    for (int j = i + 1; j < s.length(); j++) {
    if (s.charAt(i) == s.charAt(j)) {
    dp[i][j] = 2 + dp[i + 1][j - 1];
    } else {
        dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
        }
            }
        }
        return dp[0][s.length() - 1];
    }
}