import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public boolean solve(Tree root) {
        if(root==null)
        return true;
      int l=height(root.left);
      int r=height(root.right);
      if(Math.abs(l-r)<=1 && solve(root.left) && solve(root.right))
      return true;
      return false;
        
    }
    public int height(Tree root)
    {
        if(root==null)
        return 0;
        return 1+ Math.max(height(root.left),height(root.right));
    }
    
}
