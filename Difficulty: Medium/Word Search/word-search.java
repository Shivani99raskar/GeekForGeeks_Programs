//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(); // Number of test cases
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][] mat = new char[n][m];

            // Reading the matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = sc.next().charAt(0);
                }
            }

            String word = sc.next();
            Solution obj = new Solution();
            boolean ans = obj.isWordExist(mat, word);
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends


class Solution {
     public boolean isWordExist(char[][] mat, String word) {
        int n = mat.length, m = mat[0].length;
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == word.charAt(0) && dfs(mat, word, i, j, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] mat, String word, int i, int j, int index, boolean[][] visited) {
        if (index == word.length()) return true;
        if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || 
            mat[i][j] != word.charAt(index) || visited[i][j]) return false;

        visited[i][j] = true;

        boolean found = dfs(mat, word, i + 1, j, index + 1, visited) || 
                        dfs(mat, word, i - 1, j, index + 1, visited) || 
                        dfs(mat, word, i, j + 1, index + 1, visited) || 
                        dfs(mat, word, i, j - 1, index + 1, visited);   

        visited[i][j] = false;

        return found;
    }

}