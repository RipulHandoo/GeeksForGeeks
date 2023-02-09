class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int a[], int N, int key) 
    { 
        //code here.
        // making array of length 2
        int[] arr = new int[2];
        
        // declaring two variables that will be storing the index's of the key integer
        int first = -1;
        int last = -1;
        for(int i = 0;i<N;i++) {
            if(a[i] == key) {
                // if key value is not arrived in the array so far 
                // store it's first arrival in first variable
                if(first == -1) {
                    first = i;
                }
                else {
                    last = i;
                }
            } 
        }
        
        // if both the first and last are -1 that means key value is not present in the array
        if(first == -1 && last == -1) {
            arr[0] = -1;
            arr[1] = -1;
        }
        else {
            // if the last is -1 that means key value is only present at one time in the array 
            // which means both the first and last values will be same
            if(last == -1) {
                arr[0] = first;
                arr[1] = first;
            }
            else {
                arr[0] = first;
                arr[1] = last;
            }
        }
        
        return arr;
    }
}
