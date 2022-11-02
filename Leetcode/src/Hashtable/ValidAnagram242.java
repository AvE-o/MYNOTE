package Hashtable;

// 可以映射26个字母 0-25[a-z]
public class ValidAnagram242 {
    // Pseudocode
    public boolean isAnagram(String s, String t) {
        // form a list has 26 postion to store 26 letters
        List tmp = new List();

        for (int i = 0; i < s.length; i++) {
            tmp + s[i];
            tmp - t[i];
        }

        if tmp is empty:
            return true;

        return false;
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        // Creating a list that store value for each alphabet
        int[] record = new int[26];


        for (int i = 0; i < s.length(); i++) {
            // -'a' help every character in range
            record[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            record[t.charAt(i) - 'a']--;
        }

        for (int count : record) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}