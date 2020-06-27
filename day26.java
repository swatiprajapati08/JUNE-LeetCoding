class Solution {
    public int sumNumbers(TreeNode root) {
        
        if(root ==null)
            return 0;
        return Sum(root,"");
    }
    static int Sum(TreeNode root,String s)
    {
        if(root.left==null && root.right==null)
            return Integer.parseInt(s+root.val);
        int sum=0;
        if(root.left!=null)
            sum+=Sum(root.left,s+root.val);
        if(root.right!=null)
            sum+=Sum(root.right,s+root.val);
       return sum;
    }
}
