import java.util.*;
/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public int solve(Tree root) {
        if(root==null)
        return 0;
        if(root.left==null && root.right==null)
        return root.val;
        int l=solve(root.left);
        int r=solve(root.right);
        return root.val+l+r;
    }
}
