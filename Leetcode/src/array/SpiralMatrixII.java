package array;

// my solution with many mistake but right idea;
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int counter = 1;
        while (n/2 > 0) {
            // result [0][x]
            for (int i = 0; i < n - 1; i++ ) {
                result[0][i] = counter++;
            }
            // result [x][0]
            for (int i = 0; i < n - 1; i++) {
                result[i][0] = counter++;
            }
            // result [x][x]
            for (int i = n - 1; i > 0; i--) {
                result[n][i] = counter++;
            }
            // result[x][0]
            for (int i = n - 1; i >0; i--) {
                result[i][0] = counter++;
            }
            n++;
        }
        if (n%2 != 0) {
            result[n/2][n/2] = counter;
        }
        return result;
    }
}

class Solution {
    public int[][] generateMatrix(int n) {
        int loop = 0;  // 控制循环次数
        int[][] res = new int[n][n];
        int start = 0;  // 每次循环的开始点(start, start)
        int count = 1;  // 定义填充数字
        int i, j;

        while (loop++ < n / 2) { // 判断边界后，loop从1开始
            // 模拟上侧从左到右
            for (j = start; j < n - loop; j++) {
                res[start][j] = count++;
            }

            // 模拟右侧从上到下
            for (i = start; i < n - loop; i++) {
                res[i][j] = count++;
            }

            // 模拟下侧从右到左
            for (; j >= loop; j--) {
                res[i][j] = count++;
            }

            // 模拟左侧从下到上
            for (; i >= loop; i--) {
                res[i][j] = count++;
            }
            start++;
        }

        if (n % 2 == 1) {
            res[start][start] = count;
        }

        return res;
    }
}
