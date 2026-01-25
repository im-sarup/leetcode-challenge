import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        // Create a map for Roman numeral values
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0; // Store the final integer value
        int n = s.length(); // Length of the Roman numeral string

        // Traverse the string from left to right
        for (int i = 0; i < n; i++) {
            // Get the value of the current Roman numeral
            int current = romanMap.get(s.charAt(i));

            // Check if the next numeral exists and is larger (subtraction rule)
            if (i < n - 1 && current < romanMap.get(s.charAt(i + 1))) {
                // Subtract the current value if the next value is larger
                result -= current;
            } else {
                // Otherwise, add the current value
                result += current;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        RomanToInteger converter = new RomanToInteger();

        // Example input
        String s = "III";
        System.out.println("The integer value of " + s + " is: " + converter.romanToInt(s));

        // Additional test cases
        System.out.println("The integer value of IX is: " + converter.romanToInt("IX"));
        System.out.println("The integer value of LVIII is: " + converter.romanToInt("LVIII"));
        System.out.println("The integer value of MCMXCIV is: " + converter.romanToInt("MCMXCIV"));
    }
}
