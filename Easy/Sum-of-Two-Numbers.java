import java.util.*;

class Solution {
    public boolean solve(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        while(l<r)
        {
            int sum=nums[l]+nums[r];
            if(sum>k)
            {
                r--;
            }
            else if(sum<k)
            {
                l++;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
}
