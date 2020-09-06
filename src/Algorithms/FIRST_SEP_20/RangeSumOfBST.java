package Algorithms.FIRST_SEP_20;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import org.junit.Test;


/**
 * @title	938. Range Sum of BST
 *
 * @desc	
 * 			Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
 *			The binary search tree is guaranteed to have unique values.
 *
 */

public class RangeSumOfBST {
	int value = 0;
    
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        
        if (root.val >= L && root.val <= R) {
            value += root.val;
        }

        if (root.val < L) {
            rangeSumBST(root.right, L, R); 
        } else if (root.val > R) {
            rangeSumBST(root.left, L, R); 
        } else {
            rangeSumBST(root.left, L, R); 
            rangeSumBST(root.right, L, R); 
        }
        
        return value;
        
    }
}
