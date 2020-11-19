import java.util.*;

class Solution {
    public int solve(int[][] matrix) {
        int count=0;
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[i].length; j++)
            {
                if(matrix[i][j]==1)
                {
                    count+=1;
                    bfs(matrix,i,j);
                }
            }
            
        }
        return count;
    }
     public void bfs(int[][] grid ,int i,int j)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]==0)
        
            return;
            grid[i][j]=0;
            bfs(grid,i+1,j);
            bfs(grid,i-1,j);
            
            bfs(grid,i,j-1);
            bfs(grid,i,j+1);
            
            
    }
}


    
