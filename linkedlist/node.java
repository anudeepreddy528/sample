package linkedlist;

public class node {
	int data;
	node next;
	static node root = null;
	static node temp = null;
	public node(int data) {
		this.data = data;
		this.next = null;
	}
	public node() {
	}
	public static void main(String[] args) {
		insert(1);
		insert(2);
		insert(2);
		insert(1);
		//insert(3);
		//insert(4);
		//insert(4);
		//print();
		//reverse();
		//System.out.println();
		//recrev(root);
		print();
		System.out.println();
		//removedupliactes();
		node itr = root;
			temp = root;
		boolean res = false;
		res = isPalindrome(itr);
		System.out.println("isPalindrome is "+res);
		itr = root;
		oddEven(itr);
	}
	private static void oddEven(node itr) {
		// TODO Auto-generated method stub
		
	}
	private static boolean isPalindrome(node itr) {
		if(itr.next != null) {
			boolean res = isPalindrome(itr.next);
			if(!res) {
				return false;
			}
		}

		if(itr.data != temp.data) {
			return false;
		}
			System.out.println("itr.data ->"+itr.data+" temp.data ->"+temp.data);
			temp = temp.next;
			return true;
	}
	private static void removedupliactes() {
		node current = root;
		node itr = root;
		node nextnode = null;
		while(current.next != null) {
			nextnode = current.next;
			if(current.data == nextnode.data && nextnode.next != null) {
				current.next = nextnode.next;
				nextnode = nextnode.next;
			}
			if(current.data == nextnode.data && nextnode.next == null) {
				current.next = null;
				break;
			}			
			current = current.next;
		}
		System.out.println();
		System.out.println("linked list without Duplicates:");
		while(itr!=null) {
			System.out.print(itr.data+" ");
			itr = itr.next;
		}
	}
	private static void recrev(node current) {

		if(current.next == null) {
			root = current;
			return;
		}
		recrev(current.next);
		node prev = current.next;
		prev.next = current;
		current.next = null;
	}
	private static void reverse() {
		node current = root;
		node nextnode,prev;
		prev = null;
		System.out.println();
		while(current != null) {
			nextnode     = current.next;
			current.next = prev;
			prev    	 = current;
			current 	 = nextnode;
		}
		root = prev;
		node itr = root;
		while(itr != null) {
			System.out.print(itr.data+" ");
			itr = itr.next;
		}
	}
	private static void print() {
		node temp = root;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	private static void insert(int data) {
		node temp = new node(data);
		if(root == null) {
			root = temp;
		}
		else {
			node itr = root;
			while(itr.next != null) {
				itr = itr.next;
			}
			itr.next = temp;
		}
	}
}
