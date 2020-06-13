//


class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
        if(n==0) return new ArrayList();
        
        Arrays.sort(nums);
        int ans[]=new int[nums.length];
        Arrays.fill(ans,1);
        
        for(int i=1;i<n;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(nums[i]%nums[j]==0)
                    ans[i]=Math.max(ans[i],ans[j]+1);
            }
        }
        int maxIndex=0;
        for(int i=1;i<n;i++)
            maxIndex=ans[i]>ans[maxIndex]? i:maxIndex;
        
        List<Integer> list=new ArrayList<Integer>();
        int temp=nums[maxIndex];
        int curr=ans[maxIndex];
        
        for(int i=maxIndex;i>=0;i--)
        {
            if(temp%nums[i]==0 && curr==ans[i])
            {
                list.add(nums[i]);
                temp=nums[i];
                curr--;
            }
        }
        return list;
        
    }
}
