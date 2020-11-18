import java.util.*;

class Solution {
    public int solve(int[] nums) {
        Arrays.sort(nums);
        int res=1;
        for(int i:nums)
        {
            if(i==res)
            res++;
        }
        return res;
    }
}
