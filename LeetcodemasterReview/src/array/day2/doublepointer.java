package array.day2;

public class doublepointer {
}

class RemoveElement27{
    // double pointer
    // 3,2,2,3
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}

class RemoveDuplicatesfromSortedArray26 {
    // double pointer
    public int removeDuplicates(int[] nums) {
        // slow index
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}

class MoveZeroes283 {
    // double pointer
    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }

        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }

    }
}

// Stack solve this question would be much easy and intuitive
class BackspaceStringCompare844 {
    // using stack[?]
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack<Character>();
        for(char c: s.toCharArray()) {
            if (c != '#') {
                sStack.push(c);
            } else if (!sStack.isEmpty()) {
                sStack.pop();
            }
        }

        Stack<Character> tStack = new Stack<Character>();
        for(char c: t.toCharArray()) {
            if (c != '#') {
                tStack.push(c);
            } else if (!tStack.isEmpty()) {
                tStack.pop();
            }
        }

        while(!sStack.isEmpty()) {
            char curr = sStack.pop();
            if(tStack.isEmpty() || tStack.pop() != curr) {
                return false;
            }
        }

        return sStack.isEmpty() && tStack.isEmpty();
    }
}

class SquaresofaSortedArray977 {
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
