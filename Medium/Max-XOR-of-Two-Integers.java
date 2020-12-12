import java.util.*;
class Solution {
    public int solve(int[] nums) {
    int mask=0,max=0;
    for(int i=31; i>=0; i--)
    {
        mask=mask | (1<<i);
        Set<Integer> res=new HashSet<>();
        for(int num:nums)
        res.add(mask & num);
        int tmp=max | (1<<i);
        for(int pre:res)
        {
            if(res.contains(tmp ^ pre))
            {
                max=tmp;
                break;
            }
        }
    }
    return max;
    }
}
