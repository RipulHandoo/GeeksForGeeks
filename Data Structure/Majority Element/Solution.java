
class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0;i<size;i++) {
            if(map.containsKey(a[i])) {
                map.put(a[i],map.get(a[i]) + 1);
            }
            if(!map.containsKey(a[i])) {
                map.put(a[i],1);
            }
        }
        
//       this loop is used to traverse the HashMap
        for(Map.Entry<Integer,Integer> e : map.entrySet()) {
            if(e.getValue() > (a.length/2)) {
                return e.getKey();
            }
        }
        return -1;
    }
}
