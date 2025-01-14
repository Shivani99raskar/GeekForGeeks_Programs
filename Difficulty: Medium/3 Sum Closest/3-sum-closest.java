//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            int target = Integer.parseInt(sc.nextLine());
            Solution ob = new Solution();
            int ans = ob.closest3Sum(arr, target);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int closest3Sum(int[] arr, int target) {
      int n = arr.length;
        Arrays.sort(arr);
        int res = 0;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n - 2; i++) {
            
            int l = i + 1, r = n - 1;

            while (l < r) {
                int currSum = arr[i] + arr[l] + arr[r];

               
                if (Math.abs(currSum - target) < minDiff) {
                    minDiff = Math.abs(currSum - target);
                    res = currSum;
                }
                else if(Math.abs(currSum - target) == minDiff) {
                    res = Math.max(res, currSum);
                }

                if (currSum > target)
                    r--;

             
                else
                    l++;
            }
        }

        return res;
    }
};