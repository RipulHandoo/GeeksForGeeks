class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        int start = 0;
        int last = 0;
        boolean flag = false;
        long currSum = 0;
        for(int i = 0;i<n;i++) {
            currSum += arr[i];
            if(currSum >= s) {
                last = i;
                while(currSum > s && last > start) {
                    currSum -= arr[start];
                    ++start;
                }
                
                if(currSum == s) {
                    list.add(start+1);
                    list.add(last+1);
                    flag = true;
                    break;
                }
            }
        }
        if(flag == false) {
            list.add(-1);
        }
        return list;
    }
}
