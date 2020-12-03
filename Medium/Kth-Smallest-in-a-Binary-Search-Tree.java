import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public int solve(Tree root, int k) {
    List<Integer> l = new ArrayList();
    inorder(root,l);
    return l.get(k);
           
    }
    public void inorder(Tree node,List<Integer> l){
        if(node==null)
            return;
        inorder(node.left,l);
        l.add(node.val);
        inorder(node.right,l);
        
    }
}
