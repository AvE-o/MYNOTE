package hashtable;

public class TwoSum1 {
    // using Hashtalbe instead of double for loop to improve efficiency
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        // Key,     Value
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                res[0] = i;
                res[1] = map.get(temp); // get the Value[postion] for nums
            }

            map.put(nums[i], i); // put value and postion inside the map
        }
        return res;
    }
}
