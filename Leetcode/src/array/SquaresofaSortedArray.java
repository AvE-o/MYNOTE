package array;

public class SquaresofaSortedArray {
    public int[] sortedSquares(int[] nums) {
        int index = nums.length - 1;
        int i = 0;
        int j = nums.length - 1;
        int[] result = new int[nums.length];
        while (i <= j) {
            if (nums[i] * nums[i] > nums[j] * nums[j] ) {
                result[index--] = nums[i] * nums[i];
                i++;
            }
            else {
                result[index--] = nums[j] * nums[j];
                j--;
            }
        }
        return result;
    }
}
