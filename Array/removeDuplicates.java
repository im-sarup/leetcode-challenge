public class removeDuplicates {
    public int removeDupli(int[] nums) {
        if (nums.length == 0) {
            return 0; // If the array is empty, return 0
        }

        // Pointer for the unique elements
        int uniqueIndex = 0;

        // Traverse the array with another pointer
        for (int i = 1; i < nums.length; i++) {
            // If the current element is not equal to the last unique element
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++; // Move the unique pointer forward
                nums[uniqueIndex] = nums[i]; // Update the next unique position
            }
        }

        // Return the number of unique elements (index + 1)
        return uniqueIndex + 1;
    }

    public static void main(String[] args) {

        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        removeDuplicates solution = new removeDuplicates();
        int newLength = solution.removeDupli(nums);

        // Print the modified array and its new length
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nNew length: " + newLength);
    }
}
