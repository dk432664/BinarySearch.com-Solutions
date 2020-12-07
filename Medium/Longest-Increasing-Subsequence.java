import java.util.*;
class Solution {
    public int solve(int[] nums) {
    if(nums==null || nums.length==0)
    return 0;
    int lis[]=new int[nums.length];
    lis[0]=1;
    for(int i=1; i<nums.length; i++)
        {
        lis[i]=1;
    for(int j=0; j<i; j++)
           {
    if(nums[i]>nums[j])
    lis[i]=Math.max(lis[i],lis[j]+1);
           }
        }
    int res=lis[0];
    for(int i=1; i<lis.length; i++)
        {
            res=Math.max(res,lis[i]);
        }
        return res;    
    }
}
