import java.util.*;
class Solution {
    public String solve(String s) {
      String res="";
      int n = s.length();
      for (int i = 0; i < n; i++) {
      int count = 1;
            while (i < n - 1 && 
                   s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            String co=String.valueOf(count);
            res+=co;
            res+=s.charAt(i);
      }
      return res;
    }
}
