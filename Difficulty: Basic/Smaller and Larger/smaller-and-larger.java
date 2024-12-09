//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] strNumbers = input.split(" ");
            int[] arr = new int[strNumbers.length];
            for (int i = 0; i < strNumbers.length; i++) {
                arr[i] = Integer.parseInt(strNumbers[i]);
            }
            int x = sc.nextInt();
            sc.nextLine(); // consume the newline
            int[] ans = new Solution().getMoreAndLess(arr, x);
            System.out.println(ans[0] + " " + ans[1]);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int[] getMoreAndLess(int[] arr, int x) {
        int []arr1 = new int[2];
        arr1[0] = smallCheck(arr,x);
        arr1[1]= largeCheck(arr,x);
        return arr1;
        
    }
    
    int smallCheck(int []arr, int x){
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] <= x){
                start = mid+1;
            }
            else
            end = end -1;
        }
        
        return start;
    }
    
    int largeCheck(int []arr, int x){
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] >= x){
                end = mid - 1;
            }
            else
            start = mid+1;
        }
        return arr.length - end -1;
    }
}