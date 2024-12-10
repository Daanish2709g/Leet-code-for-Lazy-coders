/*Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"

 

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.*/

class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU"; // Include both lowercase and uppercase vowels
        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Move the left pointer until it points to a vowel
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            // Move the right pointer until it points to a vowel
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }
            // Swap the vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move pointers inward
            left++;
            right--;
        }

        return new String(chars); // Return the modified string
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "IceCreAm";
        String output = solution.reverseVowels(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}


