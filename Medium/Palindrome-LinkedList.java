import java.util.*;

/**
 * class LLNode {
 *   int val;
 *   LLNode next;
 * }
 */
class Solution {
    public boolean solve(LLNode node) {
        boolean ispalin=true;
        Stack<Integer> st=new Stack<>();
        LLNode curr=node;
        while(curr!=null)
        {
            st.push(curr.val);
            curr=curr.next;
        }
        LLNode rem=node;
        while(rem!=null)
        {
            int res=st.pop();
            if(rem.val==res)
            {
            ispalin=true;
            }
            else{
            
            ispalin=false;
            break;
        
            }
        rem=rem.next;
        }
        return ispalin;
    }
}
