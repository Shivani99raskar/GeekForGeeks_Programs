//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isPowerof3(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String isPowerof3(int N){
        int i = 1;
        if(N==1){
            return "Yes";
        }
        while(Math.pow(3,i)<=N){
            if(Math.pow(3,i)==N){
                return "Yes";
            }
            i++;
        }
        return "No";
    }
}