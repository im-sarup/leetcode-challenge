public class LengthOfLastWord {
    public int lastWordLength(String s) {
        int n = s.length();
        if (n == 0) {
            return 0; // If the string is empty, return 0.
        }

        int mark = -1; // Initialize mark to -1 to indicate no space found yet.
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') { // Single quotes for a character comparison.
                if (mark == -1) {
                    continue; // Skip trailing spaces.
                } else {
                    return mark - i; // Return the length of the last word.
                }
            } else if (mark == -1) {
                mark = i; // Mark the end of the last word.
            }
        }

        // If the loop finishes without encountering a space, return the length of the
        // string up to mark.
        return mark + 1;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        LengthOfLastWord solution = new LengthOfLastWord(); // Create an instance of the class.
        int lengthWord = solution.lastWordLength(s); // Call the method on the instance.
        System.out.println("Length of last word is: " + lengthWord);
    }
}
