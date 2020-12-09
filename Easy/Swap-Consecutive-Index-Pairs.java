import java.util.*;
class Solution {
    public int[] solve(int[] nums) {
        int k = 0;
        while (k < nums.length - 2) {
            int temp = nums[k];
            nums[k] = nums[k + 2];
            nums[k + 2] = temp;
            if (k % 2!=0)
                k = k + 3;
            else
                k++;
        }
        return nums;
    }
}
