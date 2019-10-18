package test;

import java.util.LinkedList;
import java.util.Queue;

public class bst {
	int data;
	bst left;
	bst right;
	static bst itr  = null;
	
	public bst() {
	}
	public bst(int data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public static void main(String[] args) {
		bst root = null;
		root = insert(root, 8);
		root = insert(root, 6);
		root = insert(root, 10);
		root = insert(root, 5);
		root = insert(root, 7);
		root = insert(root, 9);
		root = insert(root, 12);
		inorder(root);
		itr = root; 
		itr = LSA(itr, 6, 12);
		System.out.println();
		System.out.println("Parent node is: "+itr.data);
		levelOrder(root);
	}

	private static void levelOrder(bst root) {
		Queue<bst> queue = new LinkedList<bst>();
		if(root == null)return;
		queue.add(root);
		while(!queue.isEmpty()) {
			bst current = queue.peek();
			if(current.left != null)queue.add(current.left);
			if(current.right != null)queue.add(current.right);
			System.out.print(current.data+" ");
			queue.poll();
		}
	}
	private static bst LSA(bst root, int c1, int c2) {
		
		if(root == null) {
			return null;
		}
		
		if(root.data == c1 || root.data == c2) {
			return root;
		}
		
		if(root.data >= c1 || root.data >= c2) {
			root.left = LSA(root.left,c1,c2);
		}
		
		if(root.data < c1 || root.data < c2) {
			root.right = LSA(root.right,c1,c2);
		}
		
		if(root.left != null && root.right != null) {
			return root;
		}
		
		if(root.left != null && root.right == null) {
			return root;
		}
		
		if(root.right != null && root.left == null) {
			return root;
		}
		
		return root;
	}
	private static void inorder(bst root) {
		if(root == null ) {
			return;
		}
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
	}

	private static bst insert(bst root, int data) {
		bst node = new bst(data);
		if( root == null ) {
			root = node;
		}
		else if(root.data >= node.data) {
			root.left = insert(root.left, data);
		}
		else {
			root.right = insert(root.right, data);
		}
		return root;
	}

}
