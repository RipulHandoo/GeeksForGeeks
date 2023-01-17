// Given a sorted array of size N and an integer K, find the position at which K is present in the array using binary search.

// Example 1:

// Input:
// N = 5
// arr[] = {1 2 3 4 5} 
// K = 4
// Output: 3
// Explanation: 4 appears at index 3.

// Example 2:


// Input:
// N = 5
// arr[] = {11 22 33 44 55} 
// K = 445
// Output: -1
// Explanation: 445 is not present.

// Your Task:  
// You dont need to read input or print anything. Complete the function binarysearch() which takes arr[], N and K as input parameters and returns the index of K in the array. If K is not present in the array, return -1.


// Expected Time Complexity: O(LogN)
// Expected Auxiliary Space: O(LogN) if solving recursively and O(1) otherwise.


// Constraints:

// 1 <= N <= 105
// 1 <= arr[i] <= 106
// 1 <= K <= 106


class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int first = 0;
        int last = n-1;
        int num = 0;
        int mid = first + (last - first)/2;
        while(last >= first) {
            if(arr[mid] < k) {
                first = mid+1;
            }
            if(arr[mid] > k) {
                last = mid-1;
            }
            if(arr[mid] == k) {
                num = mid;
                break;
            }
            else {
                num = -1;
            }
            mid = (first+last)/2;
        }
        return num;
    }
}
