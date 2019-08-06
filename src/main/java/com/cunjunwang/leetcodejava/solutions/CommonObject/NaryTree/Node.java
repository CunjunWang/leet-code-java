package com.cunjunwang.leetcodejava.solutions.CommonObject.NaryTree;

import lombok.ToString;

import java.util.List;

/**
 * Created by CunjunWang on 2019-08-06.
 */
@ToString
public class Node {

    public int val;

    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }

}
