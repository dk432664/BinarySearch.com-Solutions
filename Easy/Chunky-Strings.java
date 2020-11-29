import java.util.*;
class Solution {
    public String[] solve(String s, int n) {
     String arr[]=new String[(s.length()-1)/n +1];
     for (int i = 0; i < s.length(); i += n) {
            arr[i / n] = s.substring(i, Math.min(i + n, s.length()));
        }
        return arr;
    }
}
