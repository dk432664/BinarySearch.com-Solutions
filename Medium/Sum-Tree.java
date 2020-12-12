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
       int left_data = 0, right_data = 0; 
       if (root == null
                || (root.left == null && root.right == null)) 
            return true; 
        else
        { 
        if (root.left != null)  
        left_data = root.left.val; 
         if (root.right != null)  
        right_data = root.right.val; 
    if (root.val == left_data + right_data &&  solve(root.left) &&
        solve(root.right)) 
                   
                return true; 
    }
       
        return false;
    }
}
