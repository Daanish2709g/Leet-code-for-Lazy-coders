/*Alice and Bob are playing a game. Initially, Alice has a string word = "a".

You are given a positive integer k.

Now Bob will ask Alice to perform the following operation forever:

Generate a new string by changing each character in word to its next character in the
  English alphabet, and append it to the original word.
For example, performing the operation on "c" generates "cd" and 
  performing the operation on "zb" generates "zbac".

Return the value of the kth character in word, after enough operations have been done
  for word to have at least k characters.

Note that the character 'z' can be changed to 'a' in the operation.

 

Example 1:

Input: k = 5

Output: "b"

Explanation:

Initially, word = "a". We need to do the operation three times:

Generated string is "b", word becomes "ab".
Generated string is "bc", word becomes "abbc".
Generated string is "bccd", word becomes "abbcbccd".
Example 2:

Input: k = 10

Output: "c"

Constraints:

1 <= k <= 500*/

public class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");

        // Keep generating and appending until the length of the string is at least k
        while (word.length() < k) {
            StringBuilder newString = new StringBuilder();

            // Generate the next string by transforming each character in word
            for (char c : word.toString().toCharArray()) {
                char nextChar = (char) (((c - 'a' + 1) % 26) + 'a');
                newString.append(nextChar);
            }

            // Append the new string to the original word
            word.append(newString);
        }

        // Return the k-th character (1-indexed, so we need k - 1 for 0-based indexing)
        return word.charAt(k - 1);
    }
}

