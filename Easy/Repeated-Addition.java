import java.util.*;

class Solution {
    public int solve(int n) {
        int res=0;
        int sum=0;
        int pop=0;
        while(n!=0)
        {
            sum+=n%10;
            n=n/10;
        }
        while(sum!=0)
        {
            res+=sum%10;
            sum=sum/10;
           
        }
        while(res!=0)
        {
            pop+=res%10;
            res=res/10;
        }
        return pop;
    }
}
