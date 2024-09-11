//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int N = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);
            int Mat[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String S1[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    Mat[i][j] = Integer.parseInt(S1[j]);
                }
            }
            Solution ob = new Solution();
            System.out.println(ob.sortedCount(N, M, Mat));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int sortedCount(int N, int M, int Mat[][]) {
     int count=0;
     for(int i=0;i<N;i++)
     {
         boolean isIncreasing = true;
         boolean isDecreasing = true;
         for(int j=1;j<M;j++)
         {
             if(Mat[i][j]<=Mat[i][j-1])
             {
              isIncreasing = false;   
             }
             if(Mat[i][j]>=Mat[i][j-1])
             {
              isDecreasing = false;   
             }
             
         }
         if (isIncreasing || isDecreasing) {
                count++;
            }
     }
     return count;
    }
}