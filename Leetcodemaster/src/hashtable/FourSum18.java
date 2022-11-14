package hashtable;

public class FourSum18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // same as sum3 sort the list first;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        // first loop
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] > target) {
                return result;
            }

            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }

            // second loop
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j - 1] == nums[j]) {
                    continue;
                }

                int left = j + 1;
                int right = nums.length - 1;

                // same as Sum3 but with four numbers
                // change 0 to target since target could be any numbers
                while (left < right) {
                    if ((nums[i] + nums[j] + nums[left] + nums[right]) > target) {
                        right--;
                    } else if ((nums[i] + nums[j] + nums[left] + nums[right]) < target) {
                        left++;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while (left < right && nums[right] == nums[right - 1]) right--;
                        while (left < right && nums[left] == nums[left + 1]) left++;

                        right--;
                        left++;
                    }
                }
            }
        }
        return result;
    }
}
