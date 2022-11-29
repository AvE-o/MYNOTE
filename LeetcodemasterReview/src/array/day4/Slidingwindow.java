package array.day4;

public class Slidingwindow {
}

class MinimumSizeSubarraySum {
    // 双指针 滑动窗口 *错误答案
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int length = 99999999;

        while (j < nums.length) {
            if (sum < target) {
                sum += nums[j];
                j++;
            } else if (sum == target){
                length = j - i + 1;
                sum -= nums[i];
                i++;
            } else if (sum > target) {
                sum -= nums[i];
                i++;
            }
        }

        return length;
    }

    // 双指针 滑动窗口 正确答案
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int sum = 0;
        int length = Integer.MAX_VALUE;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while(sum >= target) {
                length = Math.min(length, j - i + 1);
                sum -= nums[i++];
            }
        }
        return length == Integer.MAX_VALUE ? 0 : length;

    }
}
