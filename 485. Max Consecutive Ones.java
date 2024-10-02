/*Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3

Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.*/
  
  
  class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int maxcount = 0;

        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 1) {
                int currcount = 0;
            
            

            while (i < nums.length && nums[i] == 1 ){
                currcount++;
                i++;
            }

            maxcount = Math.max(maxcount, currcount);


        }
        }

        return maxcount;

    }
}
