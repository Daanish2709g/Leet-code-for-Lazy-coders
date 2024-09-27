/*Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. 
  The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between
  two words. The returned string should only have a single space separating the
  words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single 
  space in the reversed string.

  Constraints:

1 <= s.length <= 104
s contains English letters (upper-case and lower-case), 
digits, and spaces ' '.
There is at least one word in s.
  
  */

class Solution {
    public String reverseWords(String s) {
       s = s.trim();
       String[] words = s.split("\\s+");
       StringBuilder reversed = new StringBuilder();
       for ( int i = words.length -1; i>= 0; i--) {
        reversed.append(words[i]);
        if( i > 0){
            reversed.append(" ");
        }
       }
       return reversed.toString();
    }

}

// Approach:

/*Trim the input string:

s = s.trim(); removes any leading or trailing spaces from the input string to 
  ensure that there are no extra spaces before the first word or after 
  the last word.
Split the string into words:

s.split("\\s+"); splits the string by one or more spaces. This ensures
  that any extra spaces between words are handled correctly, and the 
  result is an array of words.
Reverse the words:

We use a StringBuilder to append the words from the last to the first. 
  This reverses their order.
A space is appended between words but not after the last word.
Return the reversed string:

The toString() method of StringBuilder returns the final result, 
  which is the words in reverse order, separated by single spaces.*/

