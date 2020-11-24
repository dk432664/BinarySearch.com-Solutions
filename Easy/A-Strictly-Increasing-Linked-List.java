import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public boolean solve(LLNode head) {
        LLNode curr=head;
        
        while(curr.next!=null)
        {
            if(curr.val==curr.next.val)
            return false;
            else if(curr.val>curr.next.val)
            return false;
            curr=curr.next;
        }
        return true;
    }
}
