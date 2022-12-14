package array;

public class ValidPerfectSquare367 {
    // binary search remember to use LONG
    public boolean isPerfectSquare(int num) {
        long low = 0;
        long high = num;
        boolean ans = false;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid * mid == num) {
                return true;
            }
            else if (mid * mid < num) {
                low = mid + 1;

            }
            else if (mid * mid > num) {
                high = mid - 1;
            }

        }
        return false;
    }
}
