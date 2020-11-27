import java.util.*;

class Solution {
    public int solve(int[] nums) {
      HashMap<Integer,Integer> res=new HashMap<>();
      for(int i:nums)
      {
          res.put(i,res.getOrDefault(i,0)+1);
      }
      for(int i:res.keySet())
      {
          if(res.get(i)>1)
          return i;
      }
      return -1;
    }
}
