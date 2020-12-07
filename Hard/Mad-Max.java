import java.util.*;
class Solution {
    public int[] solve(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] arr = new int[n - k + 1];
        for (int i = 0; i < n; i++) {
        while (dq.size() > 0 && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }
            dq.addLast(i);
            if (i >= k - 1) {
                while (dq.size() > 0 && i - dq.peekFirst() >= k) {
                    dq.pollFirst();
                }
                arr[i - k + 1] = nums[dq.peekFirst()];
            }
        }
