import java.util.*;

class Solution {
    public int[] solve(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            arr[i]=nums[i]*nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
    
}
