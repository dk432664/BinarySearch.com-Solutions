import java.util.*;

class Solution {
    public int solve(int a) {
      int current = 1;
    while (a > current) {
        if (a % current!=0) {
            return -1; 
        }
        a /= current;
        ++current;
    }
    if (current == a) {
        return current;
    }
    return -1;
    }
}
