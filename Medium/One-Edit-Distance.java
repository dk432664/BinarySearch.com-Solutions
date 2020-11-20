import java.util.*;

class Solution {
    public boolean solve(String s0, String s1) {
       int m = s0.length(), n = s1.length(); 
       if(s0.equals(s1))
       return true;
  if (Math.abs(m - n) > 1) 
        return false; 
  int count = 0; 
  int i = 0, j = 0; 
    while (i < m && j < n) 
    { 
    if (s0.charAt(i) != s1.charAt(j)) 
        { if (count == 1) 
                return false; 
            if (m > n) 
                i++; 
            else if (m< n) 
                j++; 
            else 
            { 
                i++; 
                j++; 
            } 
        count++; 
        } 
      else 
        { 
            i++; 
            j++; 
        } 
    } 
  if (i < m || j < n) 
        count++; 
  
    return (count == 1);  
    }
}
