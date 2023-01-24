class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i = 0;i<n;i++) {
            if(arr[i] == i+1) {
                array.add(arr[i]);
            }
        }
        return array;
    }
}
