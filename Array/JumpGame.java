public class JumpGame {
    public boolean canJump(int nums[]) {
        int n = nums.length;
        int i = 0;
        if (n == 0)
            return false;
        int value = nums[i + 1];

        // for (int i = 0; i < 1; i++) {
        // value = nums[i];
        // }
        if (n - 2 == value) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // int nums[] = {}; //false
        int nums[] = { 2, 3, 1, 1, 4 }; // true
        // int nums[] = { 3, 2, 1, 0, 4 }; //false
        JumpGame solution = new JumpGame();
        boolean ans = solution.canJump(nums);
        System.out.println(ans);

    }

}
