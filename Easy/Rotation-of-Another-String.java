import java.util.*;

class Solution {
    public boolean solve(String s0, String s1) {
        if(s0.length()!=s1.length())
        return false;
        return (s0+s0).contains(s1);
    }
}
