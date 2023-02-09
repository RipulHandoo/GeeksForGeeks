class Sol
{
    Boolean check (String s)
    {
        // your code here      
        boolean flag = true;
        // check if the first character of the string is eqaul to all the other character 
        // if not than return true else return false
        for(int j = 1;j<s.length();j++){
            if(s.charAt(0) != s.charAt(j)) {
                flag = false;
            }
        }
        return flag;
    }
}
