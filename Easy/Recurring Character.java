import java.util.*;

class Solution {
    public int solve(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) != null)
                return i;
            map.put(s.charAt(i), 0);
        }

        return -1;
    }
}
