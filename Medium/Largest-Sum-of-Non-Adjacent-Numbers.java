import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int incl=nums[0];
        int excl_new=0;
        int excl=0;
        for(int i=1; i<nums.length; i++)
        {
           
           
            excl_new=(incl>excl)?incl:excl;
             incl=nums[i]+excl;
            excl=excl_new;
        }
        return Math.max(incl,excl);
    }
}
