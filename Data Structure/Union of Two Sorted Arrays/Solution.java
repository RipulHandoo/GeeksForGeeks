
class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<>();
        
//       adding all the elments of 1st array
        for(int i = 0;i<n;i++) {
            set.add(arr1[i]);
        }
      
//       adding all elemenst of 2nd array 
//       as it is HashSet it will only take unique elements
        for(int i =0;i<m;i++){
            set.add(arr2[i]);
        }
        
        for(int key : set) {
            list.add(key);
        }
      
//        as the output is sorted
        Collections.sort(list);
        return list;
    }
}
