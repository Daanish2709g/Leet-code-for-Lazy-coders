/*Given a fixed-length integer array arr, duplicate each occurrence of zero,
  shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.
  Do the above modifications to the input array in place and do not return anything.

 

Example 1:

Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: arr = [1,2,3]
Output: [1,2,3]
Explanation: After calling your function, the input array is modified to: [1,2,3]

Constraints:

1 <= arr.length <= 104
0 <= arr[i] <= 9
*/


// Approach 1 : Brute force
class Solution {
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
               for(int j = arr.length -1; j>i; j--){
                   arr[j] = arr[j-1];
               }
                i++;
            }
            
        }
    }
}

// Approach 2 : best approach -Two Pointer approach : 
/*Steps for the Two-Pointer Approach:
Use two pointers (i and j):

i: Points to the original array index we are reading from.
j: Points to the new position where we need to write the elements, accounting for the 
  duplicated zeros.
Traverse the array from the left (i starting from 0).

For each element:
If the element is not zero, copy it to the jth position.
If the element is zero, copy zero to both j and j + 1 (duplicating the zero).
Increment j accordingly for non-zero or duplicated zero elements.
Stop when j reaches the length of the array since you can't modify elements beyond the array's
  fixed size.

Key Idea:
The second pointer j moves faster, as it accounts for the shifts caused by zero duplication.
We process the array in a single pass, and there's no need for backward shifting.*/

