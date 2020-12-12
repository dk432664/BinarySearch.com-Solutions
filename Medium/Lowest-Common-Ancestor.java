import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public int solve(Tree root, int a, int b) {
        if(root==null)
		{
		    return 0;
		}
		if(root.val == a || root.val ==b)
		{
		    return root.val;
		}
		int left1=solve(root.left,a,b);
		int right1=solve(root.right,a,b);
		if(left1!=0 && right1!=0)
		{
		    return root.val;
		}
		else if(left1!=0)
		{
		    return left1;
		}
		else
		{
		    return right1;
		}
    }
}
