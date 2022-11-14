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


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int index = binarySearch(nums, target);
        if (index == -1) {
            return new int[] {-1, -1};
        }

        // 左右滑动来寻找 Starting & ending position of a given target value.
        int left = index;
        int right = index;

        while (left - 1 >= 0 && nums[left - 1] == nums[index]) { // 防止数组越界。逻辑短路，两个条件顺序不能换
            left--;
        }
        // 向左滑动，找右边界
        while (right + 1 < nums.length && nums[right + 1] == nums[index]) { // 防止数组越界。
            right++;
        }
        return new int[] {left, right};


    }

    public int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (nums[middle] == target) {
                return middle;
            }

            else if (target < nums[middle]) {
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }

        }

        return -1;

    }
}