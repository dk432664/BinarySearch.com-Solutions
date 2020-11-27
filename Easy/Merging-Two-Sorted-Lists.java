import java.util.*;

class Solution {
    public int[] solve(int[] lst0, int[] lst1) {
        int m=lst0.length;
        int n=lst1.length;
        int arr[]=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n)
        {
            if(lst0[i]<lst1[j])
            {
                arr[k]=lst0[i];
                i++;
            
            }
            else
            {
                 arr[k]=lst1[j];
                j++;
                
            }
            k++;
        }
        while(i<m)
        {
           arr[k]=lst0[i];
                i++;
                k++;
        }
         while(j<n)
        {
           arr[k]=lst1[j];
                j++;
                k++;
        }
        return arr;
    }
}
