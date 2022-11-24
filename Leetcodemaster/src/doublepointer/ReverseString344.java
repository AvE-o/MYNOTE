package doublepointer;

public class ReverseString344 {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        // XOR[?]
        while (i <= j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j --;
        }
    }
}
