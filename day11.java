//Sort Color


 class Solution {
    public void sortColors(int[] arr) {
       
        int freq[]=new int[3];
    for(int i:arr)
    {
        if(i==0)
        freq[0]++;
        else if(i==1)
        freq[1]++;
        else
        freq[2]++;
    }
    int i=0;
    while(freq[0]!=0){
    arr[i++]=0; freq[0]--;}
    while(freq[1]!=0){
    arr[i++]=1; freq[1]--;}
    while(freq[2]!=0){
    arr[i++]=2; freq[2]--;}
        
    }
}
    ---------------------------------------------------------------------------------------------------------------------------------------
    
    or Arrays.sort(nums);
    
    
