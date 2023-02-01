class Solution {
    
    public long getSum(long a[], long n)
    {
        // Your code goes here
        long sum =0;
        for(int i =0;i<n;i++) {
            sum += a[i];
        }
        return sum;
    }
}
