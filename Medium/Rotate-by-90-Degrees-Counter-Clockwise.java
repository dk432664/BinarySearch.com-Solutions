import java.util.*;
class Solution {
    public int[][] solve(int[][] matrix) {
        
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=i+1; j<matrix[i].length; j++)
            {
                int tem=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tem;
            }
        }
        for(int i=0; i<matrix.length; i++)
        {
            int j=0;
            int k=matrix.length-1;
            while(j<k)
            {
                int tem=matrix[j][i];
                matrix[j][i]=matrix[k][i];
                matrix[k][i]=tem;
            
            j++;
            k--;
            }     
        }
        return matrix;
    }
}
