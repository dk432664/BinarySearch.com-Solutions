import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public LLNode solve(LLNode node, int target) {
         while(node!=null && node.val==target)
            node = node.next;
         LLNode curr=node;
        while(curr!=null && curr.next!=null )  
        {
            if(curr.next.val==target)
            {
                curr.next=curr.next.next;
            }
            else{
            curr=curr.next;
        }
        }
        return node;
    }
}
