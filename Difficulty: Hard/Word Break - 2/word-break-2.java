//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String arr[] = in.readLine().trim().split("\\s+");
            String s = in.readLine();

            Solution ob = new Solution();
            String[] ans = ob.wordBreak(arr, s);
            if (ans.length == 0)
                System.out.println("[]");
            else {
                List<String> sol =
                    Arrays.stream(ans).sorted().collect(Collectors.toList());
                for (int i = 0; i < sol.size(); i++) System.out.println(sol.get(i));
            }

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static String[] wordBreak(String[] dict, String s) {
        Set<String> wordDict = new HashSet<>(Arrays.asList(dict));
        List<String> result = new ArrayList<>();
        backtrack(s, wordDict, 0, new ArrayList<>(), result);
        return result.toArray(new String[0]);  // Convert List to String[]
    }

    private static void backtrack(String s, Set<String> wordDict, int start, List<String> path, List<String> result) {
        if (start == s.length()) {
            result.add(String.join(" ", path));
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String word = s.substring(start, end);
            if (wordDict.contains(word)) {
                path.add(word);
                backtrack(s, wordDict, end, path, result);
                path.remove(path.size() - 1);
            }
        }
    }
}