import java.util.*;
/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public int solve(LLNode node, int k) {
        if(node==null)
        return 0;
        LLNode first=node;
        for(int i=0; i<k; i++)
        {
            if(first==null)
            return 0;
            first=first.next;
        }
        LLNode second=node;
        LLNode prev=null;
        while(first!=null)
        {    prev=second;
             second=second.next;
            first=first.next;
        }
        return prev.val;
    }
}
