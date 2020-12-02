import java.util.*;
class Solution {
    public int solve(int[] nums) {
        int count_even=0;
        int count_odd=0;
        for(int i : nums)
        {
            if(i%2==0)
            count_even++;
            else
            count_odd++;
            
        }
        return count_even*count_odd;
    }
}
