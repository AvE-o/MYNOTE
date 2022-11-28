package doublepointer;

public class ReverseWordsinaString151 {/**
 * 不使用Java内置方法实现
 * <p>
 * 1.去除首尾以及中间多余空格
 * 2.反转整个字符串
 * 3.反转各个单词
 */
public String reverseWords(String s) {
    // System.out.println("ReverseWords.reverseWords2() called with: s = [" + s + "]");
    // 1.去除首尾以及中间多余空格
    StringBuilder sb = removeSpace(s);
    // 2.反转整个字符串
    reverseString(sb, 0, sb.length() - 1);
    // 3.反转各个单词
    reverseEachWord(sb);
    return sb.toString();
}

    private StringBuilder removeSpace(String s) {
        // System.out.println("ReverseWords.removeSpace() called with: s = [" + s + "]");
        int start = 0;
        int end = s.length() - 1;
        while (s.charAt(start) == ' ') start++;
        while (s.charAt(end) == ' ') end--;
        StringBuilder sb = new StringBuilder();
        while (start <= end) {
            char c = s.charAt(start);
            if (c != ' ' || sb.charAt(sb.length() - 1) != ' ') {
                sb.append(c);
            }
            start++;
        }
        // System.out.println("ReverseWords.removeSpace returned: sb = [" + sb + "]");
        return sb;
    }

    /**
     * 反转字符串指定区间[start, end]的字符
     */
    public void reverseString(StringBuilder sb, int start, int end) {
        // System.out.println("ReverseWords.reverseString() called with: sb = [" + sb + "], start = [" + start + "], end = [" + end + "]");
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
        // System.out.println("ReverseWords.reverseString returned: sb = [" + sb + "]");
    }

    private void reverseEachWord(StringBuilder sb) {
        int start = 0;
        int end = 1;
        int n = sb.length();
        while (start < n) {
            while (end < n && sb.charAt(end) != ' ') {
                end++;
            }
            reverseString(sb, start, end - 1);
            start = end + 1;
            end = start + 1;
        }
    }
}


// my solution with mistake[minor]
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = removeSpace(s);
        reverseString(sb);
        reverseEachWord(sb);
        return sb.toString();


        // remove space
        private StringBuilder removeSpace(String s) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            int j = s.length() - 1;

            while (s.charAt(i) == ' ') i++; // 去掉前面空格
            while (s.charAt(j) == ' ') j--; // 去掉后面空格

            while (i <= j) {
                char c = s.charAt(i);
                // i位置本身不是空格 或者 i位置前一项 不是空格才可添加
                if (c != ' ' || s.charAt(sb.length() - 1) != ' ') {
                    sb.append(c);
                }
                i++;
            }
            return sb;
        }

        public void reverseString(StringBuilder sb, int start, int end) {
            while (start < end) {
                char temp = sb.charAt(start);
                sb.setCharAt(start, sb.charAt(end));
                sb.setCharAt(end, temp);
                start++;
                end--;
            }
        }

        public void reverseEachWord(StringBuilder sb) {
            int i = 0;
            int j = 1;
            int n = sb.length();
            while (i < n) {
                while (j < n && sb.charAt(j) != ' ') {
                    j++;
                }
                reverseString(sb, i, j - 1);
                // 移动到下一个单词
                i = j + 1;
                j = i + 1;
            }
        }
    }
}
