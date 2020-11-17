import java.util.*;

class Solution {
    public int[][] solve(int[][] matrix) {
       for(int i=0; i<matrix.length; i++)
       {
           int j=0;
           int k=matrix[i].length-1;
           while(j<k)
           {
               int tem=matrix[i][j];
               matrix[i][j++]=matrix[i][k];
               matrix[i][k--]=tem;
           }
           for(int m=0; m<matrix[i].length; m++)
           {
               matrix[i][m]=(matrix[i][m]==0)?1:0;
           }
       }
       return matrix;
    }
}
