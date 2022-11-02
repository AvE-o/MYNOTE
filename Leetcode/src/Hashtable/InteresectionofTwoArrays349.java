package Hashtable;

public class InteresectionofTwoArrays349 {

    // using to hashset and check if it's contain in both hash
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }

        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();

        for (int i : nums1) {
            set1.add(i);
        }

        for (int i : nums2) {
            if (set1.contains(i)){
                set2.add(i);
            }
        }


        return set2.stream().mapToInt(x -> x).toArray();

    }
}
