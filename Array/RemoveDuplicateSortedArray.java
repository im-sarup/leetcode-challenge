public class RemoveDuplicateSortedArray {

    public int removeDuplicates(int nums[]) {
        int n = nums.length;

        if (n <= 2) {
            return n;
        }
        int index = 2;
        // Process array to allow at most 2 duplicates.
        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 2, 2, 3 };

        // int expectedNums[] = {};

        RemoveDuplicateSortedArray solution = new RemoveDuplicateSortedArray();
        int size = solution.removeDuplicates(nums);
        System.out.println("K is: " + size);

    }
}
