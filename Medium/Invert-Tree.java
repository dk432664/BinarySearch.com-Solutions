import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public Tree solve(Tree root) {
        if(root==null)
        return root;
        Tree tem;
        tem=root.left;
        root.left=root.right;
        root.right=tem;
        solve(root.left);
        solve(root.right);
        return root;
    }
    
}
