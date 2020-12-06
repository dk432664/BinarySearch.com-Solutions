import java.util.*;
class Solution {
    public int[] solve(int[] nums) {
        if(nums==null || nums.length==0)
        return nums;
        int min = nums[0]; 
        nums[0] =0; 
     for (int i = 1; i < nums.length; i++) { 
      if (min < nums[i]) { 
        nums[i] = min; 
            }   
      else if (min >= nums[i]) { 
        int temp = nums[i]; 
        nums[i] = min; 
        min = temp; 
      }
     }
        return nums;
    }
}
