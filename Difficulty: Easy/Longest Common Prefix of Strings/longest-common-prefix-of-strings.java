//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            String ans = ob.longestCommonPrefix(arr);

            if (ans.isEmpty()) {
                System.out.print("\"\"");
            } else {
                System.out.print(ans);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        StringBuilder sb=new StringBuilder();
        sb.append(arr[0]);
        
        int max=sb.length();
        for(String v:arr){
            int val=check(sb,v);
            if(val==0){
                return "";
            }
            else if(max>val){
                max=val;
            }
        }
        return sb.toString().substring(0,max);
        
    }
    
    static int check(StringBuilder str,String str1){
        int count=0;
        int len=Math.min(str.length(),str1.length());
        for(int v=0;v<len;v++){
            if(str.charAt(v)!=str1.charAt(v)){
                return count;
            }else{
                count++;
            }
        }
        return count;
    }
}