import java.util.*;

/**
 * public class Tree {
 *   int val;
 *   Tree left;
 *   Tree right;
 * }
 */
class Solution {
    public Tree solve(Tree node0, Tree node1) {
    if (node0 == null) 
    return node1; 
    if (node1 == null) 
    return node0; 
    node0.val += node1.val; 
    node0.left = solve(node0.left, node1.left); 
    node0.right = solve(node0.right, node1.right); 
    return node0; 
    }
}
