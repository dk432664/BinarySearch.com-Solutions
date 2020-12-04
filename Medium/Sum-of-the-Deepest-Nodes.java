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
     if(root == null)
     return 0;
     Queue<Tree> q = new LinkedList<Tree>();
     q.add(root); 
     int sum = 0;
     while(!q.isEmpty()){
            sum = 0;
     int itr = q.size();
     while(itr > 0){
     Tree temp = q.poll();
     sum += temp.val;
				
    if(temp.left != null)
    q.add(temp.left);
    if(temp.right != null)
    q.add(temp.right);
    itr--;
            }
        }
        return sum;
    }
}
