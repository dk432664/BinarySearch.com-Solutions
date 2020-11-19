import java.util.*;

class Solution {
    public boolean solve(int num) {
        if(num==0)
        return true;
        if(num <0 || num%10 ==0)
        return false;
        int rem=0;
        while(rem<num)
        {
            int pop=num%10;
            
            num=num/10;
            rem=(rem*10)+pop;
           
            
        }
         if(num==rem || num==rem/10)
            {
            
            return true;
            }
            else{
        return false;
            }
        
    }
}
