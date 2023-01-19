// Given a string S, check if it is palindrome or not.

// Example 1:

// Input: S = "abba"
// Output: 1
// Explanation: S is a palindrome
// Example 2:

// Input: S = "abc" 
// Output: 0
// Explanation: S is not a palindrome
 

// Your Task:
// You don't need to read input or print anything. Complete the function isPalindrome()which accepts string S and returns an integer value 1 or 0.

// Expected Time Complexity: O(Length of S)
// Expected Auxiliary Space: O(1)


// Constraints:
// 1 <= Length of S<= 105

class Solution {
    int isPalindrome(String S) {
        // code here
        int length = S.length();
        int ret = 1;
        for(int i = 0;i<length/2;i++) {
            if(S.charAt(i) == S.charAt(length - 1 - i)) {
                ret = 1;
            }
            else {
                ret = 0;
                break;
            }
        }
        return ret;
    }
};
