package LEETCODE.tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LevelOrderTraversalII {
    List<List<Integer>> levelList = new ArrayList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        int level=0;
        helper(root,level);
        Collections.reverse(levelList);
        return  levelList;
    }
    private List<List<Integer>> helper(TreeNode root,int level){
        if(root== null){
            return null;
        }
        if(level==levelList.size()){
            levelList.add(new ArrayList<Integer>());
        }
        levelList.get(level).add(root.val);

        helper(root.left, level+1);
        helper(root.right,level+1);
        return levelList;
    }
}
