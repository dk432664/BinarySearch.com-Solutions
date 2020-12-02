import java.util.*;
class Solution {
    public int solve(String message) {
    int n=message.length();
    int count[] = new int[n + 1];  
    count[0] = 1; 
    count[1] = 1; 
    if(message.charAt(0)=='0')
          return 0; 
    for (int i = 2; i <= n; i++) 
    { 
        count[i] = 0; 
    if (message.charAt(i - 1) > '0') 
            count[i] = count[i - 1]; 
    if (message.charAt(i - 2) == '1' || 
           (message.charAt(i - 2) == '2' &&  
            message.charAt(i - 1) < '7')) 
            count[i] += count[i - 2]; 
    } 
    return count[n]; 
    }
}
