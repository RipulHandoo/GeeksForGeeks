class Solution {
    public int lastIndex( String s) {
        
        int last = -1;
        for(int i = 0;i<s.length();i++) {
            if(s.charAt(i) == '1') {
                last = i;
            }
        }
        return last;
    }
}
