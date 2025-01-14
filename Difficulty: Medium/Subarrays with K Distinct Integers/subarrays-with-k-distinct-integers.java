//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume the newline character

        while (t-- > 0) {
            String[] arrInput = sc.nextLine().split(" ");
            int[] arr = new int[arrInput.length];
            for (int i = 0; i < arrInput.length; i++) {
                arr[i] = Integer.parseInt(arrInput[i]);
            }

            int k = Integer.parseInt(sc.nextLine());

            Solution obj = new Solution();
            System.out.println(obj.exactlyK(arr, k));
            System.out.println("~");
        }

        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
public static int atmost(int nums[],int k) {
          HashMap<Integer,Integer>map=new HashMap<>();
          int i=0,j=0;
          int count=0;
          while(j<nums.length)
          {
               map.put(nums[j],map.getOrDefault(nums[j],0)+1);
               while(map.size()>k)
               {
                    map.put(nums[i],map.get(nums[i])-1);
                    if(map.get(nums[i])==0)
                    {
                         map.remove(nums[i]);
                    }
                    i++;
               }
               count+=j-i+1;
               j++;
          }
          return count;
    }
    static int exactlyK(int arr[], int k) {
        // code here
        return atmost(arr,k)-atmost(arr,k-1);
    }
}
