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
       if(root.left==null && root.right==null)
       return root;
       Tree l=solve(root.left);
       Tree r=solve(root.right);
       if(root.left==null)
       root.val=root.val+r.val;
       if(root.right==null)
       root.val=root.val+l.val;
       if(root.left!=null && root.right!=null)
       root.val=root.val+l.val+r.val;
       return root;
    }
}
