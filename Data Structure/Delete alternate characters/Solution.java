class Solution {
    static String delAlternate(String S) {
        // code here
        String str = new String();
        for(int i =0;i<S.length();i++) {
           str = str + S.charAt(i);
            i++;
        }
        return str;
    }
}
