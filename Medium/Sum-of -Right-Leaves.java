import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
int sum=0;
 public int solve(Tree root) {
    helper(root);
    return sum;
   
       
}
public void helper(Tree root)
{
     if(root==null)
    {
            return;
    }
     else if(root.right!=null && root.right.left==null && root.right.right==null)
        {
            sum+= root.right.val;
        }
     helper(root.left);
     helper(root.right);
}
}
