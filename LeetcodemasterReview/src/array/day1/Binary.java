package array.day1;



class BinarySearch704 {
    // O(log n)
    // binary search
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        // 左闭右闭
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }

        return -1;
    }
}

class SearchInsertPosition35 {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + ((r - l) >> 1); // 防止溢出
            if (nums[mid] > target) {
                r = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                // 1. 目标值等于数组中某一个元素  return mid;
                return mid;
            }
        }
        // 2.目标值在数组所有元素之前 3.目标值插入数组中 4.目标值在数组所有元素之后 return right + 1;
        return r + 1;
    }
}

class FindFirstandLastPositionofElementinSortedArray34 {
    // 我的解 有错
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + ((r - l) >> 1);
            if (nums[mid] == target) {
                while (nums[mid] == nums[mid] + 1) {
                    mid = mid + 1;
                }


                return new int[] {Math.max(mid - 1, 0), mid};
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            }
        }
        return new int[] {-1, -1};
    }
    // 例子
    public int[] searchRange(int[] nums, int target) {
        int index = binarySearch(nums, target); // 二分查找

        if (index == -1) { // nums 中不存在 target，直接返回 {-1, -1}
            return new int[] {-1, -1}; // 匿名数组
        }
        // nums 中存在 targe，则左右滑动指针，来找到符合题意的区间
        int left = index;
        int right = index;
        // 向左滑动，找左边界
        while (left - 1 >= 0 && nums[left - 1] == nums[index]) { // 防止数组越界。逻辑短路，两个条件顺序不能换
            left--;
        }
        // 向左滑动，找右边界
        while (right + 1 < nums.length && nums[right + 1] == nums[index]) { // 防止数组越界。
            right++;
        }
        return new int[] {left, right};
    }

    /**
     * 二分查找
     * @param nums
     * @param target
     */
    public int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1; // 不变量：左闭右闭区间

        while (left <= right) { // 不变量：左闭右闭区间
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1; // 不变量：左闭右闭区间
            }
        }
        return -1; // 不存在
    }
}

class Sqrtx69 {
    // BinarySearch(奇怪.jpg)
    public int mySqrt(int x) {
        long l = 0;
        long r = x;
        long ans = 0;

        while (l <= r) {
            long mid = l + ((r - l) >> 2);

            if (mid * mid > x) {
                r = mid - 1;
            } else if ( mid * mid < x) {
                l = mid + 1;
                ans = mid;
            } else {
                return (int)mid;
            }
        }
        return (int)ans;
    }
}

class ValidPerfectSquare367 {
    public boolean isPerfectSquare(int num) {
        long l = 0;
        long r = num;

        while (l <= r) {
            long mid = l + ((r - l) >> 2);

            if (mid * mid > num) {
                r = mid - 1;
            } else if (mid * mid < num) {
                l = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}