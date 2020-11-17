import java.util.*;

class Solution {
    public int[] solve(int[] nums) {
        for(int i=0,j=0; i<nums.length && j<nums.length; j++)
        {
            if(nums[j]!=0)
            {
                int tem=nums[j];
                nums[j]=nums[i];
                nums[i++]=tem;
            }
        }
        return nums;
    }
}
