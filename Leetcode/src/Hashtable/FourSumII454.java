package Hashtable;

public class FourSumII454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for (int i : nums1) {
            for (int j : nums2) {
                int temp = i + j;
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }
        }

        for (int i : nums3) {
            for (int j :nums4) {
                int temp = i + j;
                if (map.containsKey(0 - temp)) {
                    result += map.get(0 - temp); // 获取出现的次数 [value]
                }
            }
        }
        return result;
    }

}
