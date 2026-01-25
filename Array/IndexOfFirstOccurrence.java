public class IndexOfFirstOccurrence {
    public int strStr(String haystack, String needle) {
        // Edge case: If needle is empty, return 0.
        if (needle.isEmpty()) {
            return 0;
        }

        // Iterate through the haystack to check for the needle.
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j;
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break; // Mismatch, stop checking further.
                }
            }
            // If the entire needle is matched, return the starting index.
            if (j == needle.length()) {
                return i;
            }
        }
        // If needle is not found, return -1.
        return -1;
    }

    public static void main(String[] args) {
        String needle = "sad";
        String haystack = "sadbutsad";

        IndexOfFirstOccurrence s = new IndexOfFirstOccurrence();
        int index = s.strStr(haystack, needle);
        System.out.println(index); // Output: 0 (starting index of "sad")
    }
}
