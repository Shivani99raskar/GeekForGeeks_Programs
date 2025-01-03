//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String input = sc.nextLine();
            String[] arr = input.split(" ");

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> result = ob.groupShiftedString(arr);

            for (ArrayList<String> group : result) {
                Collections.sort(group); // Sort each group lexicographically
            }
            result.sort(Comparator.comparing(
                list -> list.get(0))); // Sort groups lexicographically

            for (ArrayList<String> group : result) {
                for (String str : group) {
                    System.out.print(str + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends



class Solution {
static String getHash(String s) {
        int shifts = s.charAt(0) - 'a';
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] - shifts);
            if (chars[i] < 'a') chars[i] += 26;
        }
        return new String(chars);
    }

    static ArrayList<ArrayList<String>> groupShiftedString(String[] arr) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        HashMap<String, Integer> mp = new HashMap<>();

        for (String s : arr) {
            String hash = getHash(s);
            if (!mp.containsKey(hash)) {
                mp.put(hash, res.size());
                res.add(new ArrayList<>());
            }
            res.get(mp.get(hash)).add(s);
        }
        return res;
    }
}
