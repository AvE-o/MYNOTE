package GraphandBinarytree;

public class FindtheTownJudge997 {
    // My approach WRONG!
    public int findJudge(int n, int[][] trust) {
        int temp = 1;

        for (int i = 0; i < trust.length; i++) {
            if (trust[i] != n) {
                temp = 0;
            }
        }
        if (trust[n] != n) {
            temp = 0;
        }

        return temp == 1;
    }
}

class Solution {
    // in-degree - out-degree = n - 1 become the judge
    public int findJudge(int n, int[][] trust) {
        if (n == 1) {return n;}
        int count[] = new int[n + 1];
        for (int[] t: trust) {
            count[t[0]]--;
            count[t[1]]++;
        }

        for (int i = 0; i <= n ; i++) {
            if (count[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}
