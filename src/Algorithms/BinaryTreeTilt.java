package Algorithms;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.Test;

import common.TreeNode;

/*
 * 563. Binary Tree Tilt
 * 
 * Given a binary tree, return the tilt of the whole tree.

	The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node values 
	and the sum of all right subtree node values. Null node has tilt 0.

	The tilt of the whole tree is defined as the sum of all nodes' tilt.
 * */

public class BinaryTreeTilt {
	
	int tilt = 0;
	public int findTilt(TreeNode root) {
		
		calcTilt(root);
        return tilt;
    }

	public int calcTilt(TreeNode root) {
		if(root == null) return 0;
		
		int left = calcTilt(root.left);
		int right = calcTilt(root.right);
		tilt += Math.abs(left-right);
		return left+right+root.val;
		
	}

	@Test
	public void test_BinaryTreeTilt() {
		
		TreeNode treeLeft = new TreeNode(2);
		TreeNode treeRight = new TreeNode(3);
		TreeNode tree1 = new TreeNode(1, treeLeft, treeRight);
		
		int result = findTilt(tree1); 
        assertEquals(1, result); 
	}
}
