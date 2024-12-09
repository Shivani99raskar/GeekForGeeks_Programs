//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the remaining newline

        for (int k = 0; k < t; k++) {
            List<Integer> arr = new ArrayList<>();
            String input = sc.nextLine();
            Scanner lineScanner = new Scanner(input);
            while (lineScanner.hasNextInt()) {
                arr.add(lineScanner.nextInt());
            }
            lineScanner.close();

            Solution ob = new Solution();
            int ans = ob.minValueToBalance(arr);
            System.out.println(ans);
        
System.out.println("~");
}

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find the minimum value required to balance the array.
    public int minValueToBalance(List<Integer> arr) {
        int n = arr.size();
        int leSu = 0, riSu = 0;
        for (int i = 0; i < n / 2; i++)
        {
            leSu += arr.get(i);
        }
        for (int i = n / 2; i < n; i++)
        {
            riSu+= arr.get(i);
        }
        return Math.abs(leSu - riSu);
    }
}