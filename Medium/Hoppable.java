import java.util.*;

class Solution {
    public boolean solve(int[] nums) {
      boolean[] dp = new boolean[nums.length]; 
      	dp[0] = true;
      	for (int currPos = 0; currPos < nums.length; currPos++) {
			
			if (dp [currPos] && nums[currPos] > 0) {
				int maxJumps = nums[currPos];
				for (int jump = 1; jump <= maxJumps; jump++) {
					if(currPos + jump < dp.length)
					{
						dp[currPos+jump] =  true;
					}
				}
			}
    }
    return dp[nums.length-1];
}

}
