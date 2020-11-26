import java.util.*;

class Solution {
    public int solve(int[] arr) {
    int min = 1;
        for(int i : arr)
            if(i == min)
                min++;
        return min;
    }
}
