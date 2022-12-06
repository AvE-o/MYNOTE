package doublepointer;

public class ThreeSum15 {
    class Solution {
        // 这里还需要考虑去重复
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);

            // i left right
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    return result;
                }

                if (i > 0 && nums[i] == nums[i - 1]) {  // 去重a
                    continue;
                }

                // left 是中间移动的那个指针 i 时左边界 right 是右边界
                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int temp = nums[i] + nums[left] + nums[right];
                    if (temp > 0) {
                        right--;
                    } else if (temp < 0) {
                        left++;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        // 去重
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
}
