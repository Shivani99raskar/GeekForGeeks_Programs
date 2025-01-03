//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }
            int k = Integer.parseInt(br.readLine());

            int ans = new Solution().countSum(arr, k);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int countSum(int[] arr, int target) {
       int count = 0;
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n - 1; i++) {
          
            // All possible 4th elements
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i] + arr[j];
                count += map.getOrDefault(target - temp, 0);
            }

            // Store frequency of all possible sums of first two elements
            for (int j = 0; j < i; j++) {
                int temp = arr[i] + arr[j];
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }

        return count;}}