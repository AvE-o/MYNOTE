package array;

public class FindFirstandLastPositionofElementinSortedArray34 {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        // int rightboarder = 0;
        // int leftboarder = 0;
        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (target < nums[middle]) {
                right = middle - 1;
                // rightboarder = middle + 1;
            }
            else if (target > nums[middle]) {
                left = middle + 1;
                // leftboarder = middle - 1;
            }
            else {
                break;
            }

        }

        if (right - left > 1){
            return new int[]{left, right};
        }
        else {
            return new int[]{-1, -1};
        }
    }
}
