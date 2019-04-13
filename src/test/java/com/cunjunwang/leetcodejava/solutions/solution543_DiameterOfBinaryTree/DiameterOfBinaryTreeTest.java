package com.cunjunwang.leetcodejava.solutions.solution543_DiameterOfBinaryTree;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import com.cunjunwang.leetcodejava.solutions.CommonObject.BinaryTree.TreeNode;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by CunjunWang on 2019-04-09.
 */
@Component
public class DiameterOfBinaryTreeTest extends LeetCodeJavaApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(DiameterOfBinaryTreeTest.class);

    @Autowired
    private DiameterOfBinaryTree diameterOfBinaryTree;

    @Test
    public void diameterOfBinaryTree() {
        // root level 0
        TreeNode A = new TreeNode(4);
        // Level 1
        TreeNode B = new TreeNode(-7);
        TreeNode C = new TreeNode(-3);
        // Level 2
        TreeNode D = new TreeNode(-9);
        TreeNode E = new TreeNode(-3);
        // Level 3
        TreeNode F = new TreeNode(9);
        TreeNode G = new TreeNode(-7);
        TreeNode H = new TreeNode(-4);
        // Level 4
        TreeNode I = new TreeNode(6);
        TreeNode J = new TreeNode(-6);
        TreeNode K = new TreeNode(-6);
        // Level 5
        TreeNode L = new TreeNode(0);
        TreeNode M = new TreeNode(6);
        TreeNode N = new TreeNode(5);
        TreeNode O = new TreeNode(9);
        // Level 6
        TreeNode P = new TreeNode(-1);
        TreeNode Q = new TreeNode(-4);
        TreeNode R = new TreeNode(-2);

        A.left = B;
        A.right = C;

        C.left = D;
        C.right = E;

        D.left = F;
        D.right = G;
        E.left = H;

        F.left = I;
        G.left = J;
        G.right = J;

        I.left = L;
        I.right = M;
        J.left = N;
        K.left = O;

        L.right = P;
        M.left = Q;
        O.left = R;

        logger.info("Tree Data: {}", A);
        logger.info("Result: {}", diameterOfBinaryTree.diameterOfBinaryTree(A));
    }
}