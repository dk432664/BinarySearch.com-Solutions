import java.util.*;

class Solution {
    public boolean solve(String s) {
        if(s.length()%2!=0)
        return false;
       Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='(')
            st.push(s.charAt(i));
             if(s.charAt(i)==')')
             {if (st.isEmpty())
                 return false;
                 char last = st.peek();
                 if (s.charAt(i) == ')' && last == '(')
                 st.pop();
               else 
              return false;
             }
         
        }
         
        return st.isEmpty();
    }
}
