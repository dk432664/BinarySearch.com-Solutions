import java.util.*;
class Solution {
    public String solve(String s, int k) {
        k = k % 26;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int c = (int) (s.charAt(i) - 'a');
            c = (c + k + 26) % 26;

            sb.append((char) (c + 'a'));
        }
        return sb.toString();
    }
}
