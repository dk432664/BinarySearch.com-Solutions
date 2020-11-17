import java.util.*;

class Solution {
    public int solve(int[] nums) {
        int count=0;
        int co=0;
        for(int i=0; i<nums.length; i++)
        {
            
           while(nums[i]!=0)
           {
              
               nums[i]=nums[i]/10;
               count++;
               
           }
           if(count%2!=0)
                co++;
           count=0;
        }
        return co;
    }
}
