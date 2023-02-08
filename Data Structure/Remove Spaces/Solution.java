class Solution
{
   
    String modify(String S)
    {
        // your code here
        String str = new String();
        for(int i = 0;i<S.length();i++) {
            if(S.charAt(i) != ' ') {
                str += S.charAt(i);
            }
        }
        return str;
    }
}
