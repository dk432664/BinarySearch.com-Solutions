import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public int[] solve(Tree root) {
     List<Integer> res=new ArrayList<>();
     helper(root,res);
     int arr[]=new int [res.size()];
     for(int i=0; i<res.size(); i++)
     {
         arr[i]=res.get(i);
     }
     
     return arr;
         
         
     }
    public void helper(Tree root, List < Integer > res) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left, res);
            }
            res.add(root.val);
            if (root.right != null) {
                helper(root.right, res);
            }
        }  
    }
}
