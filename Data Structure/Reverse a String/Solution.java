// You are given a string s. You need to reverse the string.

// Example 1:

// Input:
// s = Geeks
// Output: skeeG
// Example 2:

// Input:
// s = for
// Output: rof
// Your Task:

// You only need to complete the function reverseWord() that takes s as parameter and returns the reversed string.

// Expected Time Complexity: O(|S|).
// Expected Auxiliary Space: O(1).

// Constraints:
// 1 <= |s| <= 10000

class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        Stack<Character> s = new Stack<>();
        
        for(int i = 0;i<str.length(); i++) {
            s.push(str.charAt(i));
        }
        String newStr = "";
        int i =0;
        while(!s.isEmpty()) {
            newStr += s.pop();
            i++;
        }
        return newStr;
    }
}
