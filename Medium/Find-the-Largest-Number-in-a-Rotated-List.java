import java.util.*;

class Solution {
    public int solve(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else
                high = mid;
        }
        if (low == 0)
            return arr[n - 1];
        return arr[low - 1];
    }
}
