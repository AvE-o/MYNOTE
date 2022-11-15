package reversestring;

public class ReverseStringII541 {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i += 2 * k) {
            int l = i;
            int r = Math.min(ch.length - 1, l + k - 1);
            while (l < r) {
                ch[l] ^= ch[r];
                ch[r] ^= ch[l];
                ch[l] ^= ch[r];
                l++;
                r--;
            }
        }
        return new String(ch);
    }
}
