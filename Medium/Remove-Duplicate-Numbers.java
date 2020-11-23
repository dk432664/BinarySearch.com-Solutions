import java.util.*;

class Solution {
    public int[] solve(int[] nums) {
   
      Map<Integer, Integer> map = new HashMap();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        
        List<Integer> list = new ArrayList();
        for (int x : nums) {
            if (map.get(x) == 1) {
                list.add(x);
            }
        }
        
        int[] arr = new int[list.size()];
        int k = 0;
        for (int x : list) {
            arr[k++] = x;
        }
        return arr;
    }
}
