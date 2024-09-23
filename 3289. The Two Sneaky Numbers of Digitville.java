/*In the town of Digitville, there was a list of numbers called nums
  containing integers from 0 to n - 1. Each number was supposed to
  appear exactly once in the list, however, two mischievous 
  numbers sneaked in an additional time, making the list longer than usual.

As the town detective, your task is to find these two sneaky numbers.
  Return an array of size two containing the two numbers (in any order),
  so peace can return to Digitville.

 

Example 1:

Input: nums = [0,1,1,0]

Output: [0,1]

Explanation:

The numbers 0 and 1 each appear twice in the array.

Example 2:

Input: nums = [0,3,2,1,3,2]

Output: [2,3]

Explanation:

The numbers 2 and 3 each appear twice in the array.

Example 3:

Input: nums = [7,1,5,4,3,4,6,0,9,5,8,2]

Output: [4,5]

Explanation:

The numbers 4 and 5 each appear twice in the array.

 

Constraints:

2 <= n <= 100
nums.length == n + 2
0 <= nums[i] < n
*/
// approach 1 : 
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length - 2;
        
        int[] count = new int[n];
        int[] res = new int[2];
        int index = 0;
        for (int num : nums) {
            count[num]++;
        }
        for (int i = 0; i < n; i++){
            if (count[i] == 2){
                res[index] = i;
                index++;
           }
        }
        return res;
    }
}
//// approach 2 :

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length - 2;
        
        Arrays.sort(nums);

        int[] res = new int[2];
        int index = 0;

        for ( int i = 1; i < nums.length; i++){
            if ( nums[i] == nums[i-1]){
                res[index] = nums[i];
                index++;
            }
        }
         return res;
    }

   
}

/*We start iterating from index 1 (second element) to the end of the array.
In each iteration, we compare the current element nums[i] with the previous
  element nums[i - 1].
If nums[i] == nums[i - 1], it means we found a duplicate. We store this 
  duplicate in the result array res.
index++ ensures that we store the next duplicate in the next available
  position in res.
After this loop completes, we will have found exactly two duplicates 
  because we know the array contains exactly two repeating numbers.*/
  
