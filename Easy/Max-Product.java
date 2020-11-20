import java.util.*;

class Solution {
    public int solve(int[] nums) {
        if(nums.length<2)
        return 0;
        Arrays.sort(nums);
        int max=nums[0]*nums[1];
        for(int i=1; i<nums.length-1; i++)
        {
            if(nums[i]*nums[i+1]>max)
            {
                max=nums[i]*nums[i+1];
            }
        }
        return max;
    }
}
