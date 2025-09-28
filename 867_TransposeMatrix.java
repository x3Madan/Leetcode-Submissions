/**
 * PROBLEM: 867. Transpose Matrix
 * LINK: https://leetcode.com/problems/transpose-matrix/
 * 
 * Description:
 * Given a 2D integer array matrix, return the transpose of matrix.
 * The transpose of a matrix is the matrix flipped over its main diagonal, 
 * switching the matrix's row and column indices.
 * 
 * Example 1:
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[1,4,7],[2,5,8],[3,6,9]]
 * 
 * Example 2:
 * Input: matrix = [[1,2,3],[4,5,6]]
 * Output: [[1,4],[2,5],[3,6]]
 */

class Solution {
    /**
     * Returns the transpose of the given matrix.
     * 
     * Approach: Create a new matrix with dimensions swapped (cols x rows instead of rows x cols).
     * Iterate through the original matrix and assign each element to its transposed position.
     * 
     * Time Complexity: O(m * n) where m is rows and n is columns
     * Space Complexity: O(m * n) for the new transposed matrix
     * 
     * @param matrix The input matrix to transpose
     * @return The transposed matrix
     */
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Create new matrix with swapped dimensions
        int[][] transposed = new int[cols][rows];
        
        // Fill the transposed matrix
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                transposed[col][row] = matrix[row][col];
            }
        }
        
        return transposed;
    }
}

/**
 * Key Insight:
 * The transpose operation essentially swaps the row and column indices.
 * Element at [i][j] in original matrix becomes element at [j][i] in transposed matrix.
 * 
 * For a matrix of size m x n, the transposed matrix will be of size n x m.
 * 
 * Visual Example:
 * Original:    Transposed:
 * [1,2,3]      [1,4,7]
 * [4,5,6]  →   [2,5,8]
 * [7,8,9]      [3,6,9]
 */
