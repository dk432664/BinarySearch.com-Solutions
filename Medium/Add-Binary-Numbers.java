import java.util.*;
class Solution {
    public String solve(String a, String b) {
        StringBuilder res=new StringBuilder();
        
        int i=a.length()-1;
        int j=b.length()-1;
        int c=0;
         while(i>=0 || j>=0)
        {
            int sum=c;
            if(i>=0)
            {
                sum+=a.charAt(i--)-'0';
            }
            if(j>=0)
            {
                sum+=b.charAt(j--)-'0';
            }
            res.insert(0,sum%2);
            c=sum/2;
        }
        
       
        if(c>0)
        {
            res.insert(0,1);
        }
        return res.toString();
    }
}
