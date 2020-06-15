// Search in a Binary Search Tree

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        
        if(root==null)
            return null;
        if(root.val==val)
            return root;
        
       // if(root.left==null && root.right==null && searchBST.val!=val )
         //   return val;
        if(root.val<val)
           return searchBST(root.right,val);
        else
            return searchBST(root.left,val);
        
    }
}
