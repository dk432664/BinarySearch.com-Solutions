import java.util.*;

class Solution {
    public boolean solve(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==2)
        {
            if(nums[0]*2==nums[1] || nums[0]*2>nums[1])
            return false;
        }
        else
        {
            if(nums[nums.length-2]*2==nums[nums.length-1] || nums[nums.length-2]*2>nums[nums.length-1] )
            return false;
        }
        return true;
    }
}
