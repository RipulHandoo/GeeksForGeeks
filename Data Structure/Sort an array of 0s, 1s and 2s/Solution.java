// Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


// Example 1:

// Input: 
// N = 5
// arr[]= {0 2 1 2 0}
// Output:
// 0 0 1 2 2
// Explanation:
// 0s 1s and 2s are segregated 
// into ascending order.
// Example 2:

// Input: 
// N = 3
// arr[] = {0 1 0}
// Output:
// 0 0 1
// Explanation:
// 0s 1s and 2s are segregated 
// into ascending order.

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function sort012() that takes an array arr and N as input parameters and sorts the array in-place.


// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)


// Constraints:
// 1 <= N <= 10^6
// 0 <= A[i] <= 2

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int numOfZero=0;
        int numOfOne = 0;
        int numOfTwo =0;
        for(int i =0;i<n;i++) {
            if(a[i] == 0) {
                numOfZero++;
            }
            else if(a[i] == 1) {
                numOfOne++;
            }
            else if(a[i]==2){
                numOfTwo++;
            }
        }
        int i=0;
        while(numOfZero>0) {
            a[i++] = 0;
            numOfZero--;
        }
        while(numOfOne>0) {
            a[i++] = 1;
            numOfOne--;
        }
        while(numOfTwo>0) {
            a[i++] = 2;
            numOfTwo--;
        }
    }
}

// Second Solution
public static void sort012(int a[], int n)

    {

        // code here 

        int low = 0;

        int mid = 0;

        int high = a.length-1;

        

        while(mid <= high)

        {

            switch(a[mid])

            {

                case 0:

                    int temp = a[low];

                    a[low] = a[mid];

                    a[mid] = temp;

                    low++;

                    mid++;

                    break;

                

                case 1:

                    mid++;

                    break;

                

                case 2:

                    temp = a[high];

                    a[high] = a[mid];

                    a[mid] = temp;

                    high--;

            }

        }

    }


