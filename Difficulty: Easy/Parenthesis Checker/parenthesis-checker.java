//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Reading total number of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // reading the string
            String st = sc.next();

            // calling ispar method of Paranthesis class
            // and printing "balanced" if it returns true
            // else printing "not balanced"
            if (new Solution().isParenthesisBalanced(st) == true)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    // Function to check if brackets are balanced or not.
    static boolean isParenthesisBalanced(String s) {
        if(s.length()%2==0)
        {
            Stack<Character> st=new Stack<>();
         for(int i=0;i<s.length();i++)
            {
            char c=s.charAt(i);
            if(c=='{'||c=='['||c=='(')
                st.add(c);
            else if(c=='}'||c==']'||c==')')
            {
                if(st.isEmpty())
                    return false;
                char ch=st.peek();
                if(ch=='{'&&c=='}')
                {
                    st.pop();
                }
               else if(ch=='['&&c==']')
                {
                    st.pop();
                }
                else if(ch=='('&&c==')')
                {
                    st.pop();
                }
                else{
                    return false;
                }
            }
             }
        return st.isEmpty();
        }
        else{
            return false;
        }
    }
}
