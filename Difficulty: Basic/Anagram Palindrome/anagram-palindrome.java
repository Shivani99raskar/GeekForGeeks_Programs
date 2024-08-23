//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    public static void main (String[] args)
    {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++){
		    String s = in.next();
		    if (new Sol().isPossible (s) == 1)
		        System.out.println ("Yes");
		    else
		        System.out.println ("No");
		}
	}
}

// Contributed By: Pranay Bansal


// } Driver Code Ends


class Sol
{
    int isPossible (String S)
    {
       int length=S.length();
       
       String first="";
       String last="";
       int mid=length/2;
       
       if(length%2==0)
       {
           first=S.substring(0,mid);
           last=S.substring(mid,length);
       }
       else
       {
          first=S.substring(0,mid);
           last=S.substring(mid+1,length);  
       }
       if(first.equals(last))
       return 1;
       else
       return 0;
    }
}