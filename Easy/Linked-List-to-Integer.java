import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public int solve(LLNode node) {
     int num = node.val;
        while (node.next != null) {
            num = (num << 1) | node.next.val;
            node = node.next;    
        }
        return num;  
    }
}
