package LEETCODE.tree;

public class MaximumDepthBT {

    public int maxDepth(TreeNode root) {
        return dfs(root);
    }

    private int dfs(TreeNode root){
        if(root== null)
            return 0;
        int L= dfs(root.left);
        int R= dfs(root.right);
        return Math.max(L,R)+1;
    }
}
