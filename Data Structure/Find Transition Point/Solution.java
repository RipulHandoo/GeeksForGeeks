class GfG {
    int transitionPoint(int arr[], int n) {
        // code here
       int  num = 0;
        
        for(int i = 0;i<n;i++) {
            if(arr[i] != 1) {
                num = -1;
            }
            if(arr[i] == 1) {
                num = i;
                return num;
            }
        }
        return num;
    }
}
