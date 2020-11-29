import java.util.*;
class Solution {
    public int solve(int n) {
        int c=0;
		for(int i=1;i<=n;i++){
		int m=i;
    		    while(m>0){
    		        m=m&(m-1);
    		        c++;
    		    }
		    }
		    return c;
    }
}
