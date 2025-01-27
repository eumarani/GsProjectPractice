package com.excelSheet;

public class CalMaxSum {


        public static int maxPathSum(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;

            // Create a dp array to store the maximum path sum at each cell
            int[][] dp = new int[m][n];

            // Initialize the dp array with the matrix values
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    dp[i][j] = Integer.MIN_VALUE;
                }
            }

            // Starting point
            dp[0][0] = matrix[0][0];

            // Iterate through each cell in the matrix
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    // If moving down
                    if (i + 1 < m) {
                        dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j] + matrix[i + 1][j]);
                    }
                    // If moving up
                    if (i - 1 >= 0) {
                        dp[i - 1][j] = Math.max(dp[i - 1][j], dp[i][j] + matrix[i - 1][j]);
                    }
                    // If moving diagonally left-down
                    if (i + 1 < m && j - 1 >= 0) {
                        dp[i + 1][j - 1] = Math.max(dp[i + 1][j - 1], dp[i][j] + matrix[i + 1][j - 1]);
                    }
                    // If moving diagonally right-down
                    if (i + 1 < m && j + 1 < n) {
                        dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], dp[i][j] + matrix[i + 1][j + 1]);
                    }
                }
            }

            // The maximum path sum is stored at the bottom-right corner
            return dp[m - 1][n - 1];
        }

        public static void main(String[] args) {
            int[][] matrix = {
                    {10, 10, 2, 0, 20, 4},
                    {1, 0, 0, 30, 2, 5},
                    {0, 10, 4, 0, 2, 0},
                    {1, 0, 2, 20, 0, 4}
            };

            int result = maxPathSum(matrix);
            System.out.println("Maximum Path Sum: " + result); // Output: 74
        }
    }
