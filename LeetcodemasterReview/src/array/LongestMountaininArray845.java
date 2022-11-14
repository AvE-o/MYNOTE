package array;

public class LongestMountaininArray845 {
    int skips = 0, skipt = 0;
    int i = s.length() - 1,  j = t.length() - 1;

        while (i >= 0 || j >= 0) {

        // remove backspace from s
        while (i >= 0) {
            if (s.charAt(i) == '#') {
                skips++;
                i--;
            } else if (skips > 0) {
                skips--;
                i--;
            } else {
                break;
            }
        }

        // remove backspace from t
        while (j >= 0) {
            if (t.charAt(j) == '#') {
                skipt++;
                j--;
            } else if (skipt > 0) {
                skipt--;
                j--;
            } else {
                break;
            }
        }

        if (i >=0 && j >= 0 && s.charAt(i) != t.charAt(j)) {
            return false;
        } else if ((i >= 0) != (j >= 0)) {
            return false;
        }

        i--;
        j--;


    }
        return true;
}
}
