
class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int maxOnes = 0;
        int maxOnesIndex = -1;
        for (int i = 0; i < n; i++) {
            int onesInRow = 0;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    onesInRow++;
                }
            }
            if (onesInRow > maxOnes) {
                maxOnes = onesInRow;
                maxOnesIndex = i;
            }
        }
        return maxOnesIndex;
    }
}
