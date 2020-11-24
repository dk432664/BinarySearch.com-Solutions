import java.util.*;

class Solution {
    public int solve(int a, int b, int c) {
        if(a==b && b==c)
        return 1;
        if(a==b)
        return c;
        if(b==c)
        return a;
        if(a==c)
        return b;
        else
        return a*b*c;
    }
}
