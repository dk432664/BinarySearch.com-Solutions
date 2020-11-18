import java.util.*;

class Solution {
    public boolean solve(String s) {
        HashSet<Character> res=new HashSet<>();
        for(char c:s.toCharArray())
        {
            if(res.contains(c))
            {
                return false;
            }
            else
            {
                res.add(c);
            }
        }
        return true;
    }
}
