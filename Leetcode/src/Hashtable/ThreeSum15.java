package Hashtable;

public class ThreeSum15 {
    public List<List<Integer>> threeSum(int[] nums) {
        // a + b + c = 0
        List<List<Integer>> result = new ArrayList<>();
        // 用双指针法
        // 首先对数组进行排序
        Arrays.sort(nums);

        // i -> a
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return result;
            }

            // 去重a
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                if ((nums[i] + nums[left] + nums[right]) > 0) {
                    right--;
                } else if ((nums[i] + nums[left] + nums[right]) < 0) {
                    left++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[right] == nums[right - 1]) right--;
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    right--;
                    left++;
                }
            }
        }
        return result;
    }
}
