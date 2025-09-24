/*--------------------------------------------------------+
|                                                        |
|      PROBLEM: 1.Two Sum                                |
|      LINK: https://leetcode.com/problems/two-sum/      |
|                                                        |
+--------------------------------------------------------+
+-----------------------------------------------------------PROBLEM-------------------------------------------------------------------------+
|                                                                                                                                           |
|      Instructions:                                                                                                                        |
|      Given an array of integers <nums> and an integer <target>, return indices of the two numbers such that they add up to <target>.      |
|      You may assume that each input would have exactly one solution, and you may not use the same element twice.                          |
|      You can return the answer in any order.                                                                                              |
|      Example 1:                                                                                                                           |
|      Input: nums = [2,7,11,15], target = 9                                                                                                |
|      Output: [0,1]                                                                                                                        |
|      Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].                                                                       |
|      Example 2:                                                                                                                           |
|      Input: nums = [3,2,4], target = 6                                                                                                    |
|      Output: [1,2]                                                                                                                        |
|      Example 3:                                                                                                                           |
|      Input: nums = [3,3], target = 6                                                                                                      |
|      Output: [0,1]                                                                                                                        |
|                                                                                                                                           |
|                                                                                                                                           |
+-------------------------------------------------------------------------------------------------------------------------------------------*/                                                              

//SOLUTION
/*+-------------------------ABOUT ALGORYTHM--------------------------------+
|                                                                         |
|      Strategy: Brute force checking all unique pairs                    |
|      Time Complexity: O(n²) due to nested loops                         |
|      Space Complexity: O(1) using only constant extra space             |
|      Optimization: j < i condition prevents duplicate pair checks       |
|      Early termination: Returns immediately when solution is found      |
|                                                                         |
+-------------------------------------------------------------------------+*/

class Solution {                                                                    
    public int[] twoSum(int[] nums, int target) {                                   
        for(int i = 0; i < nums.length; i++){                                      
            for(int j = 0; j < i; j++){                                            
                if(nums[i] + nums[j] == target){                                   
                    return new int[] {i, j};   // Return immediately when found    
                }                                                                
            }                                                                    
        }                                                                        
        return new int[0]; // Return empty array if no solution found           
    }                                                                           
}

/*-------------------------------------CODE EXPLANATION AND ABOUT CODE-------------------------------------------+ 
|                                                                                                               |
|      Step 1:  Method invocation                    → twoSum method is called with input array and target      |
|      Step 2:  Initialize outer loop counter i = 0  → Start from first element of array                        |
|      Step 3:  Check i < array length               → Verify we haven't reached end of array                   |
|      Step 4:  Initialize inner loop counter j = 0  → Start comparing from first element                       |
|      Step 5:  Check j < i                          → Ensure j is always before i to avoid duplicates          |
|      Step 6:  Calculate current pair sum           → Add nums[i] + nums[j]                                    |
|      Step 7:  Compare sum with target              → Check if sum equals target value                         |
|      Step 8:  If match → return indices            → Immediately return [i, j] if solution found              |
|      Step 9:  If no match → increment j            → Move to next element before i                            |
|      Step 10: Repeat inner loop until j >= i       → Check all possible j values for current i                |
|      Step 11: Increment i                          → Move to next element in array                            |
|      Step 12: Repeat outer loop until i >= length  → Process all elements in array                            |
|      Step 13: Return empty array                   → No solution found after checking all pairs               |
|                                                                                                               |
+---------------------------------------------------------------------------------------------------------------*/
 
