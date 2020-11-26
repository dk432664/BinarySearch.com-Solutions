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
        return helper(root,root);
    }
    public boolean helper(Tree root1,Tree root2)
    {
        if(root1==null && root2==null)
        return true;
        if(root1==null || root2==null)
        return false;
        return (root1.val==root2.val)&& helper( root1.left,root2.right) && 
        helper( root1.right, root2.left);
        
    }
}
