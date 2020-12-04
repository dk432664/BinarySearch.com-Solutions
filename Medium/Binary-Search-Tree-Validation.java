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
        return valid(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public boolean valid(Tree root,Integer min,Integer max)
    {
        if(root==null)
        return true;
        if(min>root.val || max<root.val || min==null || max==null)
        return false;
        return valid(root.left,min,root.val) && valid(root.right,root.val,max);
    }
}
