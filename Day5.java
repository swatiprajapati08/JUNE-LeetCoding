//Random Pick with Weight

/*Input: 
["Solution","pickIndex"]
[[[1]],[]]
Output: [null,0]*/


class Solution {
        private int[] wt;
        private int sum;
    public Solution(int[] w) {
        sum=0;
        wt=new int[w.length];
        wt[0]=w[0];
        for(int i=1;i<w.length;i++)   // use prefix sum to calculate the bucket size
           wt[i]=wt[i-1]+w[i]; 
         
    }
    
    public int pickIndex() {
        sum=wt[wt.length-1];
        
        int index=(int)(Math.random()*sum);  //generate the random number from 0 to sum
        
        return bs(index+1);
    }
    private int bs(int val)
    {
        int l=0;
        int r=wt.length-1;
        while(l<r)
        {
            int mid=l+(r-l)/2;
            if(wt[mid]<val)
                l=mid+1;
            else
                r=mid;
        }
        return l;
    }
        
}
