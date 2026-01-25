public class MejorityElement {
    public int majorityElement(int[] nums) {
        // Initialize the candidate for majority element and its count
        int candidate = nums[0];
        int count = 0;

        // Step 1: Find the candidate for the majority element
        for (int num : nums) {
            if (count == 0) {
                // Update the candidate if count becomes zero
                candidate = num;
            }
            // Increment or decrement count based on the current number
            count += (num == candidate) ? 1 : -1;
        }

        // Step 2 (Optional): Verify the candidate is indeed the majority element
        // This step is not needed if the input guarantees a majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // Check if the candidate appears more than n/2 times
        if (count > nums.length / 2) {
            return candidate;
        }

        throw new IllegalArgumentException("No majority element found");
    }

    public static void main(String[] args) {
        MejorityElement solution = new MejorityElement();
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println("Majority Element: " + solution.majorityElement(nums));
    }

}
