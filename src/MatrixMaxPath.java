
    public class MatrixMaxPath {
        public static void main(String[] args) {
            int[][] mat = {
                    {10, 10, 2, 0, 20, 4},
                    {1, 0, 0, 30, 2, 5},
                    {0, 1, 4, 0, 8, 0},
                    {1, 0, 2, 20, 0, 4}
            };

            // Call the function to compute the max path sum
            System.out.println("Maximum Path Sum: " + maxPath(mat));
        }

        public static int maxPath(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;

            // DP array to store the maximum sum to reach each cell
            int[][] dp = new int[m][n];

            // Initialize the first row of the DP table
            for (int j = 0; j < n; j++) {
                dp[0][j] = matrix[0][j]; // The first row is initialized directly from the matrix
            }

            // Fill the DP table for the rest of the rows
            for (int i = 1; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    dp[i][j] = matrix[i][j] + dp[i - 1][j];

                    if (j > 0) {
                        dp[i][j] = Math.max(dp[i][j], matrix[i][j] + dp[i - 1][j - 1]);
                    }
                    if (j < n - 1) {
                         dp[i][j] = Math.max(dp[i][j], matrix[i][j] + dp[i - 1][j + 1]);
                    }
                }

            }
            int maxSum = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                maxSum = Math.max(maxSum, dp[m - 1][j]);
            }
            return maxSum;
        }
    }


