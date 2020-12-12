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
     if(root == null) 
      return true; 
    Queue<Tree> queue =new LinkedList<>(); 
    boolean flag = false; 
    queue.add(root); 
    while(!queue.isEmpty()) 
        { 
            Tree temp = queue.poll(); 
            if(temp.left != null) 
            { 
             if(flag == true) 
            return false; 
            queue.add(temp.left); 
            } 
            else
            flag = true; 
            if(temp.right != null) 
            { 
              if(flag == true) 
                    return false; 
            queue.add(temp.right); 
                  
            } 
            else 
            flag = true; 
        } 
         
        return true;     
    }
}
