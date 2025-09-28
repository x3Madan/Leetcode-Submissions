/**
 * PROBLEM: 1. Two Sum
 * LINK: https://leetcode.com/problems/two-sum/
 * 
 * Instructions:
 * Given an array of integers nums and an integer target, return indices of the two numbers 
 * such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the 
 * same element twice. You can return the answer in any order.
 * 
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * 
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */

// ====================================================================================
// SOLUTION 1: BRUTE FORCE APPROACH
// ====================================================================================

/**
 * Algorithm: Nested Loop Enumeration
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 * 
 * Approach:
 * - Check all possible pairs of elements using nested loops
 * - Inner loop constraint (j < i) ensures each pair is checked exactly once
 * - Prevents element reuse and avoids duplicate checks
 */
class SolutionBruteForce {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }
}

// ====================================================================================
// SOLUTION 2: OPTIMIZED HASH MAP APPROACH
// ====================================================================================

/**
 * Algorithm: One-Pass Hash Table
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
 * Approach:
 * - Single pass through the array with hash table lookups
 * - For each element, calculate complement (target - nums[i])
 * - Check if complement exists in previously seen elements
 * - Store current element after checking to avoid self-match
 */
class SolutionOpti{
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[] {numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }
        
        return new int[0];
    }
}

// ====================================================================================
// COMPARISON ANALYSIS
// ====================================================================================

/**
 * WHY HASH MAP APPROACH IS BETTER:
 * 
 * Performance:
 * - Brute Force: O(n²) - Checks every possible pair
 * - Hash Map: O(n) - Single pass with instant lookups
 * 
 * Efficiency:
 * - Brute Force: Slow for large arrays (>10,000 elements)
 * - Hash Map: Scales efficiently even with massive inputs
 * 
 * Trade-off:
 * - Uses O(n) extra memory for hash table
 * - Dramatically improves time complexity from O(n²) to O(n)
 * 
 * Real-world Analogy:
 * - Brute Force: Ask every pair "Do your ages sum to 60?"
 * - Hash Map: Remember ages you've seen, instantly find complements
 */

























