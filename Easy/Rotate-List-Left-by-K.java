import java.util.*;

class Solution {
    public int[] solve(int[] nums, int k) {
        int arr[]=new int[nums.length];
        int z=0;
        for(int i=k; i<nums.length; i++)
        {
            arr[z++]=nums[i];
        }
        for(int i=0; i<k; i++)
        {
            arr[z++]=nums[i];
        }
        return arr;
    }
}
