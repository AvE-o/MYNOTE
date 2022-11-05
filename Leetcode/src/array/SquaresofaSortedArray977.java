package array;

public class SquaresofaSortedArray977 {
    // double pointer
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int index = nums.length - 1;

        // creat a new array
        int[] result = new int[nums.length];
        while (i <= j) {
            if (nums[i] * nums[i] <= nums[j] * nums[j]) {
                result[index--] = nums[j] * nums[j];
                j--;
            } else {
                result[index--] = nums[i] * nums[i];
                i++;
            }
        }
        return result;
    }
}
