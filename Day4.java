//Reverse String
/*          https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/539/week-1-june-1st-june-7th/3350/             */

class Solution {
    public void reverseString(char[] s) {
        
        
        int i=0,j=s.length-1;
        while(i<j)
        {
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            j--;
            i++;
        }  
    }
}
