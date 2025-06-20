package com.questons.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
	public Object rigth;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class BFSArray {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
    List<List<Integer>> Outer = new LinkedList<List<Integer>>();
    TreeNode divider = root;
    List<Integer> inner = new ArrayList<Integer>();
    inner.add(divider.val);
    Outer.add(inner);
    inner = new ArrayList<Integer>();
    queue.add(divider);
    while(!queue.isEmpty()) {
    	TreeNode current =  queue.poll();
    	if(current.left != null ) {
    		queue.add(current.left);
    		inner.add(current.left.val);
    	}
    	if(current.right != null) {
    		queue.add(current.right);
    		inner.add(current.right.val);
    		if(divider != null && current.right == divider.right) {
    			inner = new ArrayList<Integer>();
    		}
    	}


        Outer.add(inner);    	
    	if(divider != null){
            divider = divider.right;
        }
    }
    
    
    
    return Outer;
    }
    
	public static void main(String[] args) {
		

	}

}
