import java.util.*;
class Solution {
    public int solve(int[] nums) {
    int count=0;
    int arr[]=new int[nums.length];
    for(int i=0; i<nums.length; i++)
    {
        arr[i]=nums[i];
    }
    Arrays.sort(arr);
    for(int i=0; i<nums.length; i++)
    {
        if(nums[i]==arr[i])
        count++;
    }
    return count;
    }
}
