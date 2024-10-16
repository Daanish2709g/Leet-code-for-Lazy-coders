/*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106*/


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m = nums1.length;
        int n = nums2.length;

        int[] findMedianSortedArrays = new int[m + n];

        int i = 0, j= 0, k= 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                findMedianSortedArrays[k++] = nums1[i++];
            } else {
                findMedianSortedArrays[k++] = nums2[j++];
            }
        }

        while (i < m) {
            findMedianSortedArrays[k++] = nums1[i++];
        }

        // Copy remaining elements of nums2, if any
        while (j < n) {
            findMedianSortedArrays[k++] = nums2[j++];
        }


        int totalLen = m + n;

        if(totalLen % 2 == 1){
            return findMedianSortedArrays[totalLen / 2];
        } else {
            int mid1 = totalLen / 2;
            int mid2 = mid1 - 1;
            return (findMedianSortedArrays[mid1] + findMedianSortedArrays[mid2]) / 2.0;
        }


    }

    public static void main(String[] args){
        Solution sol = new Solution();
        int[] arr1 = {1,5};
        int[] arr2 = {2,4};

        System.out.println(sol.findMedianSortedArrays(arr1, arr2));
    }
}
