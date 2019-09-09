package com.cunjunwang.leetcodejava.solutions.solution0547_FriendCircles;

import com.cunjunwang.leetcodejava.LeetCodeJavaApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by CunjunWang on 2019-09-09.
 */
public class FriendCirclesTest extends LeetCodeJavaApplicationTests {

    @Autowired
    private FriendCircles friendCircles;

    @Test
    public void findCircleNum() {
        int[][] M = {{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1}, {1, 0, 1, 1}};
        int res = friendCircles.findCircleNum(M);
        System.out.println(res);
    }
}