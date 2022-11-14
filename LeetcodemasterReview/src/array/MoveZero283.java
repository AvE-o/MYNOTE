package array;

public class MoveZero283 {
    public void moveZeroes(int[] nums) {

        int slowIndex = 0;

        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != 0) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }

        while (slowIndex < nums.length) {
            nums[slowIndex++] = 0;
        }

    }
}
