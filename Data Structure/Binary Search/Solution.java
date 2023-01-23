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
