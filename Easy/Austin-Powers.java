import java.util.*;
class Solution {
 public boolean solve(int n) {
        long i=1;
        while(i<n)
        {
            i=i*2;
        }
        return i==n;
    }
}
