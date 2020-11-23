import java.util.*;

class Solution {
    public boolean solve(int[] nums) {
         Map <Integer, Integer> map = new HashMap(); 
        HashSet <Integer> set = new HashSet(); 
                
        for(int i : nums) 
        {
                 map.put(i,map.getOrDefault(i,0)+1);       
           
        }
		
        for(int element : map.values()) 
        {
            set.add(element);
        }
        
        if(set.size() == map.size()) 
        
            return true;
        
        else
        
            return false;
    }
}
