import java.util.*;
/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public boolean solve(Tree root, int val) {
        if(root==null)
        return false;
        if(root.val==val)
            return true;
        if(val<root.val)
        return solve(root.left,val);
        else
        return solve(root.right,val);
      }
    }
