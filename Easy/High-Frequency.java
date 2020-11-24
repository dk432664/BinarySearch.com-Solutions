import java.util.*;

class Solution {
    public int solve(int[] nums) {
       HashMap<Integer,Integer> res=new HashMap<>();
       
       for(int i:nums)
       {
           res.put(i,res.getOrDefault(i,0)+1);
       }
       int max=0;
       for(int i:res.keySet())
       {
           if(res.get(i)>max)
           max=res.get(i);
       }
       
       return max;
    }
}
