package com.debasish.practise.dsa.topicwise.dp;

/**
 * Problem Description
 * Given a grid of size n * m, lets assume you are starting at (1,1) and your goal is to reach (n, m). At any instance, if you are on (x, y), you can either go to (x, y + 1) or (x + 1, y).
 *
 * Now consider if some obstacles are added to the grids. How many unique paths would there be? An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 *
 *
 *
 * Problem Constraints
 * 1 <= n, m <= 100
 * A[i][j] = 0 or 1
 *
 *
 *
 * Input Format
 * Firts and only argument A is a 2D array of size n * m.
 *
 *
 *
 * Output Format
 * Return an integer denoting the number of unique paths from (1, 1) to (n, m).
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [
 *         [0, 0, 0]
 *         [0, 1, 0]
 *         [0, 0, 0]
 *      ]
 * Input 2:
 *
 *  A = [
 *         [0, 0, 0]
 *         [1, 1, 1]
 *         [0, 0, 0]
 *      ]
 *
 *
 * Example Output
 * Output 1:
 *
 *  2
 * Output 2:
 *
 *  0
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Possible paths to reach (n, m): {(1, 1), (1, 2), (1, 3), (2, 3), (3, 3)} and {(1 ,1), (2, 1), (3, 1), (3, 2), (3, 3)}
 *  So, the total number of unique paths is 2.
 * Explanation 2:
 *
 *  It is not possible to reach (n, m) from (1, 1). So, ans is 0.
 */
public class UniquePathsInAGrid {
    /**
     * DP approach:
     * As we are visiting single cell multiple time - It has overlapping sub-problem.
     * We are using smaller substructure to get the answer of bigger sub-problem.
     * <p>
     * TC: O(M * N)
     * SC: O(M * N)
     */
    public int uniquePathsWithObstacles(int[][] A) {
        int[][] dp = new int[A.length][A[0].length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (A[i][j] == 1) {
                    dp[i][j] = 0;
                } else if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1];
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[A.length - 1][A[0].length - 1];
    }
}
