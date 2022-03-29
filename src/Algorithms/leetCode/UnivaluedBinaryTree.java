package Algorithms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

import common.TreeNode;

/*
 * 965. Univalued Binary Tree
 * 
 *A binary tree is univalued if every node in the tree has the same value.

Return true if and only if the given tree is univalued.
 * */

public class UnivaluedBinaryTree {
	
	List<Integer> checkList = new ArrayList<Integer>();
    public boolean isUnivalTree(TreeNode root) {
        checkUniValue(root);
        
        for (int val : checkList) {
        	if (val != checkList.get(0)) {
        		return false;
        	}
            
        }
		return true;
    }
    
    public void checkUniValue(TreeNode root) {
    	if (root != null) {
	        checkList.add(root.val);
	        
	        checkUniValue(root.left);
	        checkUniValue(root.right);
    	}
    }

	@Test
	public void test_BinaryTreeTilt() {
		
		TreeNode treeLeft = new TreeNode(2);
		TreeNode treeRight = new TreeNode(3);
		TreeNode tree1 = new TreeNode(1, treeLeft, treeRight);
		
		boolean result = isUnivalTree(tree1); 
        assertEquals(false, result); 
	}
}
