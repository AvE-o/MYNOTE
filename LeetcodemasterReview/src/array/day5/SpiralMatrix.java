package array.day5;

public class SpiralMatrix {
}

class SpiralMatrixII59 {
    public int[][] generateMatrix(int n) {
        int loop = 0; // 循环次数
        int[][] res = new int[n][n];
        int start = 0;
        int i, j;
        int count = 1; // 填充数字

        // 规律是所需要转的圈数是小于数字/2 的
        // 判断之后 loop + 1
        while (loop++ < n/2) {
            // - loop 是因为每一圈边都小一个
            //填充第一个边 左 -> 右
            for (j = start; j < n - loop; j++) {
                res[start][j] = count;
                count++;
            }

            //填充第二个边 上 -> 下
            for (i = start; i < n - loop; i++) {
                res[i][j] = count;
                count++;
            }

            //填充第三个边 右 -> 左
            for (j = j; j >= loop; j--) {
                res[i][j] = count;
                count++;
            }

            //填充第四个边 下 -> 上
            for (i = i; i >= loop; i--) {
                res[i][j] = count;
                count++;
            }
            start++;
        }

        if (n%2 != 0) {
            res[n/2][n/2] = count;
        }

        return res;
    }
}

class SpiralMatrix54{

    // 到第三边提示outofbound 未知原因
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        int start = 0;
        // 旋转的次数是两者的最小值/2
        int loop = 0;
        int layers = Math.min(rows, cols) / 2;
        int i,j;

        while (loop++ < layers) {
            // 1
            for (j = start; j < rows - loop; j++) {
                res.add(matrix[start][j]);
            }

            for (i = start; i < cols - loop; i++) {
                res.add(matrix[i][j]);
            }

            //res.add(i);
            //res.add(j);
            for (j = j; j >= loop; j--) {
                res.add(matrix[i][j]);
            }

            for (i = i; i >= loop; i--) {
                res.add(matrix[i][j]);
            }

            start++;
        }

        return res;
    }
}