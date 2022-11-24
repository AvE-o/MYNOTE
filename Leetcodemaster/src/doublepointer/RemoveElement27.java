package doublepointer;

public class RemoveElement27 {
    // Double pointer
    public int removeElement(int[] nums, int val) {
        // slow
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

}
