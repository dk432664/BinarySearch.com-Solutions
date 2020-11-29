import java.util.*;
class Solution {
    public boolean solve(String s0, String s1) {
        int NO_OF_CHARS = 256;
        if(s0.length()!=s1.length())
        return false;
        int count1[] = new int[NO_OF_CHARS];
        Arrays.fill(count1, 0);
        int count2[] = new int[NO_OF_CHARS];
        Arrays.fill(count2, 0);
        for(int i=0; i<s0.length() && i<s1.length(); i++)
        {
            count1[s0.charAt(i)]++;
            count2[s1.charAt(i)]++;
        }
          for (int i = 0; i < NO_OF_CHARS; i++)
            if (count1[i] != count2[i])
                return false;
         return true;
        
    }
}
