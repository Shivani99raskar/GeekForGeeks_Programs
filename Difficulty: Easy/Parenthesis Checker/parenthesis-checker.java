//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        int left=0;
        int length=x.length();
        Stack<Character>stack=new Stack<>();
        
        if(length%2!=0)
         {
        return false;
        }
        for(Character ch:x.toCharArray())
        {
            if(ch=='{'||ch=='['||ch=='(')
            {
                stack.push(ch);
            }
            else if(!stack.isEmpty())
            {
                if(ch=='}'&&stack.peek()=='{')
                {
                    stack.pop();
                }
                else if(ch==']'&&stack.peek()=='[')
                {
                    stack.pop();
                }
                else if(ch==')'&&stack.peek()=='(')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        
        return stack.isEmpty();
    }
}
