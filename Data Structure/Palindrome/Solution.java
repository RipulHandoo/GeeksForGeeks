class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        int rev = 0;
        int num_copy = 0;
        // store the original number into some random variable, which we will be using afterwards to check our condition
        int x = n;
        
        // revere the given number
        while(x > 0) {
            num_copy = x%10;
            rev = rev*10 + num_copy;
            x = x/10;
        }
        
        // check whether the reverse number is equal to the original number
        if(rev == n) {
            return "Yes";
        }
        else {
            return "No";
        }
    }
}
