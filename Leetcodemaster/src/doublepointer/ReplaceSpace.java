package doublepointer;

public class ReplaceSpace {
    // Stringbuilder solution
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}

class Solution {
    // double pointer
    public String replaceSpace(String s) {
        // 每个空格扩充 1 -> 3
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                str.append("  ");
            }
        }

        int left = s.length() - 1; // 指向原本字符串最后一个字符
        s += str.toString();
        int right = s.length() - 1; // 指向扩充后字符串最后一个字符;
        char[] chars = s.toCharArray();

        while (left >= 0) {
            if (chars[left] == ' ') {
                chars[right--] = '0';
                chars[right--] = '2';
                chars[right] = '%';
            } else {
                chars[right] = chars[left];
            }

            left--;
            right--;
        }
        return new String(chars);
    }
}