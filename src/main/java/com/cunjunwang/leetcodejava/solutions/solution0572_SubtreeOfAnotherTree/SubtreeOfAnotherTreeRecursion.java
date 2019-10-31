package com.cunjunwang.leetcodejava.solutions.solution0572_SubtreeOfAnotherTree;

import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;

/**
 * Created by CunjunWang on 2019-10-31.
 */
public class SubtreeOfAnotherTreeRecursion {

    // do the problem with recursion.
    // O(N), N is size of tree s
    // isSubtree checks whether t is a subtree of s
    // if s and t are same, return true,
    // is s and t are different, but t is the same as one of
    //  the left or right subtree of s, return true;
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null)
            return t == null;
        if (s != null && t == null)
            return false;

        if (isSame(s,t))
            return true;

        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    // isSame is to determine whether s and t are same.
    // if s and t are null, true
    // if one of s, t is null, false
    // if neither is null, compare the value
    //   if values are equal, continue with left and right subtree
    //   else false
    private boolean isSame(TreeNode s, TreeNode t) {
        if (s == null)
            return t == null;
        if (s != null && t == null)
            return false;

        if (s.val != t.val)
            return false;

        return isSame(s.left, t.left) && isSame(s.right, t.right);
    }

}
