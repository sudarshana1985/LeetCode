package LEETCODE.tree;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return helper(root,root);
    }

    public boolean helper(TreeNode t1,TreeNode t2) {

        if(t1 == null&& t2== null)
            return true;
        if(t1 == null || t2== null )
            return false;
        return (t1.val == t2.val) && helper(t1.left,t2.right) && helper(t1.right,t2.left);

    }
}