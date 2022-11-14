package array;

public class RemoveElement27 {

    public int removeDuplicates(int[] nums) {
        int slowIndex = 1;
        for (int fastIndex = 1; fastIndex < nums.length; fastIndex++) {
            // compare the nearby number if it's not duplicate
            // add to the slow pointer
            if (nums[fastIndex - 1] != nums[fastIndex]) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }

        return slowIndex;
    }
}
