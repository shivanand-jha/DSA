class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
            return true;
        int j =0;
        int i = 0;
        while(i<t.length() && j< s.length()){
            if(s.charAt(j) == t.charAt(i))
                j++;
            i++;
        }
        return j == s.length();
    }
}