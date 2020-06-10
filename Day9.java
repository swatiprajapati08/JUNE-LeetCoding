//Is Subsequence

//https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/540/week-2-june-8th-june-14th/3355/

class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int i=0,j=0,count=0;
        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
            {
                count++;
                i++;
                j++;
            }
            else
                j++;
        }
        if(count==s.length())
            return true;
        else
            return false;
    }
}
