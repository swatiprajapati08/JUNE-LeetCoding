class Solution {
    public int findDuplicate(int[] arr) {
        HashSet<Integer> hs=new HashSet<>();
        int f=-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(hs.contains(arr[i]))
                f=i;
            else
                hs.add(arr[i]);
        }
        return arr[f];
    }
}
