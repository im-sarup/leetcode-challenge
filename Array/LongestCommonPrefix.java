import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String strs[]) {
        int n = strs.length;
        // Base case
        if (n == 0)
            return "";
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[n - 1];

        int i = 0;
        while (i < first.length()) {
            if (first.charAt(i) == last.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        return i == 0 ? "" : first.substring(0, i);
    }

    public static void main(String[] args) {
        String strs[] = { "flower", "flow", "flight" };

        LongestCommonPrefix s = new LongestCommonPrefix();
        String word = s.longestCommonPrefix(strs);
        System.out.println(word);
    }
}
