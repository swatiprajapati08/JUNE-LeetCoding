class Solution {
       public int countNodes(TreeNode root) {
        
        if(root == null) return 0;
        
        int left = leftDepth(root.left);
        int right = leftDepth(root.right);
        
        if(left == right) 
            return (1 << left) + countNodes(root.right);
            
        else
            return countNodes(root.left) + (1 << right);
    }
    
    private int leftDepth(TreeNode root) {
        int ans = 0;
        
        while(root != null) {
            ans++;
            root = root.left;
        }
        
        return ans;
    }
}  
