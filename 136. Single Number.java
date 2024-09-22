/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 
Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once. */

// solution :

import java.util.Arrays;

class Solution {
    public int singleNumber(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr); // Sort the array

        // Loop through the sorted array in pairs
        for (int i = 0; i < n - 1; i = i + 2) {
            if (arr[i] != arr[i + 1]) {  // Corrected: use != for "not equal"
                return arr[i]; // If we find a non-paired element, return it
            }
        }

        // If no element was returned in the loop, return the last element
        return arr[n - 1];
    }
}

//Solution :
/*# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
The problem asks for the single number that appears only once in an array where every other number appears exactly twice. 
  Sorting the array groups identical numbers together, allowing us to scan the array in pairs. If we find a number that
  doesn't have a matching pair, that is the single number. If all pairs are matched, the last element is the single number.

# Approach
<!-- Describe your approach to solving the problem. -->
Sort the array: Sorting arranges the same numbers next to each other, so we can check in pairs.
Iterate through the array: Use a loop that skips two indices at a time (i += 2). For each pair, 
  check if arr[i] equals arr[i + 1].
Return the single number: If the current number does not match the next number, return the current number
  (arr[i]). If the loop completes without finding an unmatched pair, return the last element (arr[n-1]).*/
