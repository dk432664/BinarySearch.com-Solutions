import java.util.*;

class Solution {
    public int[] solve(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int y=n*m;
        int arr[]=new int[y];
        int rs=0;
        int cs=0;
        int re=n-1;
        int ce=m-1;
        int index=0;
        while(index<y)
        {
            for(int i=cs; i<=ce && index<y; i++)
            {
                arr[index++]=matrix[rs][i];
            }
            rs++;
            for(int i=rs; i<=re && index<y; i++)
            {
                arr[index++]=matrix[i][ce];
            }
            ce--;
            if(rs<=re)
            {
                for(int i=ce; i>=cs && index<y; i--)
                {
                    arr[index++]=matrix[re][i];
                }
               
            }
            re--;
             
            if(cs<=ce )
            {
                for(int i=re; i>=rs && index<y; i--)
                {
                    arr[index++]=matrix[i][cs];
                }
               
            }
             
            cs++;
        }
        return arr;
    }
}
