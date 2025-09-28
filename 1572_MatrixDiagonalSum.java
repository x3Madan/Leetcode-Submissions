/**
 * PROBLEM: 1572. Matrix Diagonal Sum
 * LINK: https://leetcode.com/problems/matrix-diagonal-sum/description/
 * 
 * Description:
 * Given a square matrix mat, return the sum of the matrix diagonals.
 * Only include the sum of all the elements on the primary diagonal and 
 * all the elements on the secondary diagonal that are not part of the primary diagonal.
 * 
 * Example 1:
 * Input: mat = [[1,2,3],
 *               [4,5,6],
 *               [7,8,9]]
 * Output: 25
 * Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
 * Notice that element mat[1][1] = 5 is counted only once.
 * 
 * Example 2:
 * Input: mat = [[1,1,1,1],
 *               [1,1,1,1],
 *               [1,1,1,1],
 *               [1,1,1,1]]
 * Output: 8
 * 
 * Example 3:
 * Input: mat = [[5]]
 * Output: 5
 */

class Solution {
    /**
     * Calculates the sum of both diagonals without double-counting the center element.
     * 
     * Approach: Iterate through all elements, adding primary diagonal (i == j)
     * and secondary diagonal (i + j == n-1) elements separately.
     * The 'else if' ensures center element in odd-sized matrices is only counted once.
     * 
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     * 
     * @param mat The square matrix
     * @return Sum of both diagonals without duplicates
     */
    public int diagonalSum(int[][] mat) {
        int primarySum = 0;
        int secondarySum = 0;
        int n = mat.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    primarySum += mat[i][j];
                } else if (i + j == n - 1) {
                    secondarySum += mat[i][j];
                }
            }
        }
        
        return primarySum + secondarySum;
    }
}

//Alternative Optimized Solution (O(n) Time Complexity):
class Solution {
  public int diagonalSum(int[][] mat) {
    int n = mat.length;
    int total = 0;
        
    for (int i = 0; i < n; i++) {
        total += mat[i][i];                    // Primary diagonal
        total += mat[i][n - 1 - i];           // Secondary diagonal
    }
        
    // Subtract center element if matrix size is odd (it was counted twice)
    if (n % 2 == 1) {
        total -= mat[n / 2][n / 2];
    }   
    return total;
    }
}
 
