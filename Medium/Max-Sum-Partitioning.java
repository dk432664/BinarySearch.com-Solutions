import java.util.*;
class Solution {
    public int solve(int[] nums, int k) {
     int n = nums.length;
        int[] dp = new int[n+1];
        for(int i = 0; i < n; i++) {
            int mazx = -1;
            for(int j = i;j < i+k && j < n;j++) {
                if(nums[j] > mazx) mazx = nums[j];
                int y = mazx*(j - i +1);
                y += dp[i];
                if(y > dp[j+1]) {
                    dp[j+1] = y;
                }
            }
        }
        return dp[n];       
    }
}
