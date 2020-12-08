import java.util.*;

class Solution {
    public int[][] solve(int[][] matrix) {
       for (int i = 0; i < matrix[0].length; i++) {
            int arr[] = new int[matrix.length];
            for (int j = 0; j < matrix.length; j++) {
                arr[j] = matrix[j][i];
            }
            Arrays.sort(arr);
            for (int j = 0; j < arr.length; j++) matrix[j][i] = arr[j];
        }
        return matrix;
    }
}
