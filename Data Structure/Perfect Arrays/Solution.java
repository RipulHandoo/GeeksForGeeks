class Solution{
    
    public boolean IsPerfect(int a[], int n)
    {
        // Complete the function
        
        // for doing it in O(1) space complexity, we can reverse the array and than compare each element
        boolean flag = true;
        for(int i = 0;i<=n/2;i++) {
            if(a[i] != a[n-i-1]) {
                flag = false;
                return flag;
            }
        }
        return flag;
    }
    
}
