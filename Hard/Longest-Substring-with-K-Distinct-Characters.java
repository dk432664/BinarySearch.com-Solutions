import java.util.*;

class Solution {
    public int solve(int k, String s) {
        HashMap<Character,Integer> res=new HashMap<>();
        int lo=0;
        int hi=0;
        int maxlen=0;
        for(hi=0; hi<s.length(); hi++)
        {
            res.put(s.charAt(hi),res.getOrDefault(s.charAt(hi),0)+1);
            while(res.size()>k)
            {
                if(lo<=hi && s.charAt(lo)>0)
                res.put(s.charAt(lo),res.get(s.charAt(lo))-1);
            
            if(res.get(s.charAt(lo))==0)
            res.remove(s.charAt(lo));
             lo++;
            }
           maxlen=Math.max(maxlen,hi-lo+1);
        }
        return maxlen;
    }
}
