//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim()); // Read number of test cases

        while (t-- > 0) {
            String line = read.readLine().trim(); // Read the array input
            String[] numsStr = line.split(" ");   // Split the input string by spaces
            int[] nums =
                new int[numsStr.length]; // Convert string array to integer array
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            Solution ob = new Solution();
            int ans = ob.totHammingDist(nums);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
   static int totHammingDist(int[] arr) {
        int n = arr.length;              
        int count = 0;                  
        int[] countOne = new int[32];   
        
        // Count how many numbers have the j-th bit set
        for (int num : arr) {
            for (int j = 0; j < 32; j++) {
                // Check if j-th bit is set in the current number
                if ((num & (1 << j)) != 0) {
                    countOne[j]++;
                }
            }
        }

        // Calculate Hamming distance contributed by each bit position
        for (int j = 0; j < 32; j++) {
            // countOne[j] numbers have the j-th bit set
            // (n - countOne[j]) numbers have the j-th bit unset
            // Each such pair contributes 1 to the Hamming Distance
            count += countOne[j] * (n - countOne[j]);
        }

        // Return the total Hamming Distance
        return count;
}}