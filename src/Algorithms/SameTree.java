package Algorithms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

import common.TreeNode;

/*
 * 100. Same Tree
 * 
 *	Given two binary trees, write a function to check if they are the same or not.
 *	Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
 * */

public class SameTree {
	
//	TreeNode treeNode = ;
	List<Integer> checkList = new ArrayList<Integer>();
	Stack check = new Stack<String>();
	
	 public boolean isSameTree(TreeNode p, TreeNode q) {
         if (p == null && q == null) {
             return true;
         }
         if (p == null || q == null) {
             return false;
         }
 		if (p.val != q.val) return false;
 		return isSameTree(p.right, q.right) && isSameTree(p.left, q.left)  ;

 }

	@Test
	public void test_isSameTree() {
		
		TreeNode treeLeft = new TreeNode(1);
		TreeNode treeRight = new TreeNode(2);
		TreeNode tree1 = new TreeNode(1, treeLeft, treeRight);
		
		TreeNode treeLeft2 = new TreeNode(20);
		TreeNode treeRight2 = new TreeNode(13);
		TreeNode tree2 = new TreeNode(18, treeLeft, treeRight);
		
		boolean result = isSameTree(tree1, tree2); 
        assertEquals(false, result); 
	}
}
