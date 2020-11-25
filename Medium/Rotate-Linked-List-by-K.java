import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public LLNode solve(LLNode node, int k) {
        if (node == null) 
        return node; 
  LLNode curr = node; 
    int len = 1; 
    while (curr.next != null) 
    { 
        curr = curr.next; 
        len++; 
    } 
    if (k > len) 
        k = k % len; 
      k = len - k; 
  if (k == 0 || k == len) 
        return node; 
  LLNode current = node; 
    int cnt = 1; 
    while (cnt < k && current != null) 
    { 
        current = current.next; 
        cnt++; 
    } 
  if (current == null) 
        return node; 
  LLNode kthnode = current; 
  curr.next = node; 
  node = kthnode.next; 
  kthnode.next = null; 
    return node; 
    }
}
