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
            System.out.println(ob.checkPower(N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static int checkPower(int N){
     if(N==1)
     {
         return 1;
     }
     for(int i=1;i<N;i++)
     {
         int power=1;
         for(int j=1;j<N;j++)
         {
             power=power*i;
             if(power==N)
             {
                 return 1;
             }
             if(power>N)
             {
                 break;
             }
         }
     }
     
    return 0; 
    }
}