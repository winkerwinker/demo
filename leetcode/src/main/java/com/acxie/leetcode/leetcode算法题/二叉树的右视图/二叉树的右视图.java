package com.acxie.leetcode.leetcode算法题.二叉树的右视图;




import com.acxie.leetcode.struct.treenode.TreeNode;
import com.acxie.leetcode.struct.treenode.TreeNodeUtil;

import java.util.ArrayList;

/**
 * @description:层次遍历，存入二维数组，然后取最大的
 * @create: 2020/02/06 18:41
 */
public class 二叉树的右视图 {

    static ArrayList<ArrayList<TreeNode>> result = new ArrayList<ArrayList<TreeNode>>();

    public static ArrayList<Integer> rightSideView(TreeNode root) {
        if (root==null){
            return new ArrayList<Integer>();
        }

        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        list.add(root);
        result.add(list);
        int i = 0;
        while (result.get(i).size() != 0) {
            list = new ArrayList<TreeNode>();
            for (int j = 0; j < result.get(i).size(); j++) {
                if (result.get(i).get(j).right != null) {
                    list.add(result.get(i).get(j).right);
                }
                if (result.get(i).get(j).left != null) {
                    list.add(result.get(i).get(j).left);
                }
            }
            result.add(list);
            i++;
        }
        ArrayList<Integer> re = new ArrayList<Integer>();
        for (int j = 0; j < result.size()-1; j++) {
            re.add(result.get(j).get(0).val);
        }
        return re;
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeUtil.convert(new Integer[]{1, 2, 3, null, 5, null, 4});
        System.out.println(rightSideView(treeNode));
    }
}
