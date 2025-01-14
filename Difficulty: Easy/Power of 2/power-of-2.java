//{ Driver Code Starts
// //Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driver_class {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine()); // testcases

        while (t-- > 0) {
            // input a number n
            long n = Long.parseLong(read.readLine());

            // if n is less than equal to zero then
            // it can't be a power of 2 so we print No
            if (new Solution().isPowerofTwo(n) == true)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    public static boolean isPowerofTwo(long n) {
    if(n<=0)
    {
    return false;
}
    return (n&(n-1))==0;
        
    }
}