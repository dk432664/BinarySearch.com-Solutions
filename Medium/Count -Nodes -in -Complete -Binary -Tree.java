import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public int solve(Tree tree) {
    if(tree==null)
    return 0;
    int lc=solve(tree.left);
    int rc=solve(tree.right);
    return lc+rc+1;
    }
}
