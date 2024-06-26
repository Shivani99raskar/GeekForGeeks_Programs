//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int thirdLargest(int arr[], int n)
    {
        int first=arr[0];
        int second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;
	   if(arr.length<3)
	   {
	       return -1;
	   }
	   for(int i=1;i<arr.length;i++)
	   {
	       if(arr[i]>first)
	       { 
	           third=second;
	           second=first;
	           first=arr[i];
	       }
	       else if(arr[i]>second)
	       {
	           third=second;
	           second=arr[i];
	       }
	       else if(arr[i]>third)
	       {
	           third=arr[i];
	       }
	   }
	   return third;
    }
}
