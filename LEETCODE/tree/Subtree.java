package LEETCODE.tree;

public class Subtree {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        return validateSubTree(s,t);
    }

    private boolean validateSubTree(TreeNode s, TreeNode t){
        return  s != null && ( helper(s,t) || validateSubTree(s.right,t) || validateSubTree(s.left,t));
    }

    private boolean helper(TreeNode s, TreeNode t){
        if(s== null && t== null)
            return true;
        if(s== null || t== null)
            return false;
        return s.val==t.val || helper(s.left, t.left) || helper(s.right, t.right);
    }
}
