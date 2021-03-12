package com.acxie.leetcode.struct.n_treenode;

import java.util.List;

/**
 * @description: N叉树
 * @create: 2020/02/01 20:00
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
