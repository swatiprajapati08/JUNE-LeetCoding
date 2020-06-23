class Solution {
    public int singleNumber(int[] nums) {
        int ones=0,twos=0;
        for(int i:nums)
        {
            ones=(ones^i)&(~twos);
            twos=(twos^i)&(~ones);
        }
        return ones;
    }
}

/*ones take a number have appeared only one time
and twos take element which appeared 2 times and element appear 3 times will not be part of this.*/
