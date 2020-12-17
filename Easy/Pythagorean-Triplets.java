import java.util.*;
class Solution {
    public boolean solve(int[] nums) {
    if(nums.length==0 || nums==null)
    return false;
    for (int i = 0; i < nums.length; i++) 
            nums[i] = nums[i] * nums[i]; 
            Arrays.sort(nums); 
    for (int i = nums.length - 1; i >= 2; i--) { 
           int l = 0; 
            int r = i - 1; 
            while (l < r) { 
                
                if (nums[l] + nums[r] == nums[i]) 
                    return true; 
  
               if (nums[l] + nums[r] < nums[i]) 
                    l++; 
                else
                    r--; 
            } 
        }
        return false;
    }
}
