import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;


/**
 * @title	617. Merge Two Binary Trees
 *
 * @desc	
 * 			Given two binary trees and imagine that when you put one of them to cover the other, 
 * 			some nodes of the two trees are overlapped while the others are not.
 * 			You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, 
 * 			then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
 */

public class MergeTwoBinaryTrees {
	
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
	        if (t1 == null)
	            return t2;
	        if (t2 == null)
	            return t1;
	        
	        t1.val += t2.val;
	        t1.left = mergeTrees(t1.left, t2.left);
	        t1.right = mergeTrees(t1.right, t2.right);
	        
	        return t1;
    }

}
