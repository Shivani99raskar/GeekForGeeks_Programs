//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 


class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt(); 
            int arr[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                arr[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int []ans= obj.sortArr(arr, n);
            for(int i=0;i<n;i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int[] sortArr(int[] arr, int n) 
    {/* int temp=0;
   
       for(int i=0;i<arr.length-1;i++)
       { 
           for(int j=i+1;j<arr.length;j++)
           {
               if(arr[i]>arr[j])
               {
               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
              
               }
           }
           
       }
       return arr;*/
         Arrays.sort(arr);
    return arr;
    }
  
} 