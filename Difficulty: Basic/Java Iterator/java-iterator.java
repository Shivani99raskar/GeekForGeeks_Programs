//{ Driver Code Starts


import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int n = Integer.parseInt(S[0]);
            int k = Integer.parseInt(S[1]);
            
            int[] arr = new int[n];
            String S1[] = read.readLine().split(" ");
            
            for(int i=0; i<n; i++)
                arr[i] = Integer.parseInt(S1[i]);

            Solution ob = new Solution();
            System.out.println(ob.javaIterator(n,k,arr));
        }
    }
}
// } Driver Code Ends




class Solution {
    static ArrayList<Integer> javaIterator(int n, int k, int[] arr) {
        
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(arr[i]);
        }
        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext())
        {
            if(iterator.next()<k)
            {
                iterator.remove();
            }
            
        }
        Collections.sort(list);
        return list;
        }
};