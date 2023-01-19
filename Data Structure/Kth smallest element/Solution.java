// Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

// Example 1:

// Input:
// N = 6
// arr[] = 7 10 4 3 20 15
// K = 3
// Output : 7
// Explanation :
// 3rd smallest element in the given 
// array is 7.
// Example 2:

// Input:
// N = 5
// arr[] = 7 10 4 20 15
// K = 4
// Output : 15
// Explanation :
// 4th smallest element in the given 
// array is 15.
// Your Task:
// You don't have to read input or print anything. Your task is to complete the function kthSmallest() which takes the array arr[], integers l and r denoting the starting and ending index of the array and an integer K as input and returns the Kth smallest element.
 
 
// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(log(n))
// Constraints:
// 1 <= N <= 105
// 1 <= arr[i] <= 105
// 1 <= K <= N
 

class Solution{
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int pivotLoc = low;
        
        for(int i = low;i<=high;i++) {
            if(arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[pivotLoc];
                arr[pivotLoc] = temp;
                pivotLoc++;
            }
        }
        int temp = arr[high];
        arr[high] = arr[pivotLoc];
        arr[pivotLoc]= temp;
        
        return pivotLoc;
    }
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        int pivot = partition(arr,l,r);
        
        if(pivot == k-1){
            return arr[pivot];
        }
        else if(pivot > k-1) {
            return kthSmallest(arr,l,pivot-1,k);
        }
        else {
            return kthSmallest(arr,pivot+1,r,k);
        }
    } 
}
