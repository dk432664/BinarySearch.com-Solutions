import java.util.*;

class Solution {
    public String solve(String s0, String s1) {
    StringBuilder res=new StringBuilder();
    int i=0;
    int j=0;
    while(i<s0.length() && j<s1.length())
    {
        res.append(s0.charAt(i));
        res.append(s1.charAt(j));
        i++;
        j++;
    }
    while(i<s0.length())
    {
        res.append(s0.charAt(i));
         i++;
    }
     while(j<s1.length())
    {
        res.append(s1.charAt(j));
        j++;
    }
    return res.toString();
    
    }
}
