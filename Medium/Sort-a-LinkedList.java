import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public LLNode solve(LLNode node) {
        if (node == null || node.next == null)
      return node;
   LLNode prev = null, slow =node, fast =node;
    while (fast != null && fast.next != null) {
      prev = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    prev.next = null;
    LLNode l1 = solve(node);
    LLNode l2 = solve(slow);
    return merge(l1, l2);
  }
  LLNode merge(LLNode l1, LLNode l2) {
    LLNode temp = new LLNode(0), curr = temp;
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        curr.next = l1;
        l1 = l1.next;
      } else {
        curr.next = l2;
        l2 = l2.next;
      }
      curr = curr.next;
    }
    
    if (l1 != null)
      curr.next = l1;
     
    if (l2 != null)
      curr.next = l2;

    return temp.next;
    }
}
