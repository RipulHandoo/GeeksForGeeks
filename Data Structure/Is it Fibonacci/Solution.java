class Solution {
    static long solve(int N, int K, ArrayList<Long> GeekNum) {
        //code here
        Long max_sum = Long.valueOf(0);
        for(int i = 0;i<K;i++){
            max_sum += GeekNum.get(i);
        }
        
        Long work_sum = max_sum;
        GeekNum.add(work_sum);
        for(int i = K;i<N;i++) {
            work_sum += GeekNum.get(i) - GeekNum.get(i-K);
            GeekNum.add(work_sum);
        }
        return GeekNum.get(N-1);
    }
}
