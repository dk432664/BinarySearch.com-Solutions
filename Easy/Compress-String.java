import java.util.*;

class Solution {
    public String solve(String s) {
        String res="";
        
        for(int i=0; i<s.length()-1; i++)
        {
            if(s.charAt(i)!=s.charAt(i+1))
            {
            res+=s.charAt(i);
            }
            }
        res+=s.charAt(s.length()-1);
        return res;
    }
}
