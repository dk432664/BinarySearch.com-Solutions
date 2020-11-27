import java.util.*;

class Solution {
    public int solve(int n) {
        if(n==0)
        return 0;
        int count=0;
        while(n!=0)
        {
            count++;
            n=n & (n-1);
        }
        return count;
    }
}