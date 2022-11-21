package string;

// 移动匹配
// abc|abc abc|abc

public class RepeatedSubstringPattern459 {

    // KMP
    public boolean repeatedSubstringPattern(String s) {

        int[] next = new int[s.length()];
        int j = 0;
        next[0] = 0;

        // build next
        for (int i = 1; i < s.length(); i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = next[j - 1];
            }

            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        // 末尾的值代表中间重复的字符串的长度 如果能被整除说明均为重复子字符串构成
        if (next[s.length() - 1] > 0 && s.length() % (s.length() - next[s.length() - 1]) == 0) {
            return true;
        }
        return false;


    }

}

//
