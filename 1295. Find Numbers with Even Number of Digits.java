/*Given an array nums of integers, return how many of them contain an even number of digits.

 

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.
 

Constraints:

1 <= nums.length <= 500
1 <= nums[i] <= 105*/

public class Solution {
    public static int findNumbers(int[] nums) {
        // Initialize a counter for numbers with even number of digits
        int count = 0;

        // Iterate through each number in the array
        for (int num : nums) {
            // Convert the number to a string to check the number of digits
            if (Integer.toString(num).length() % 2 == 0) {
                count++;
            }
        }

        // Return the count of numbers with even digits
        return count;
    }

    // Example usage
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int output = findNumbers(nums);
        System.out.println(output);  // Output will be 2
    }
}

