package BST;
import java.util.LinkedList;
import java.util.Queue;

class node{
	int data;
	node left;
	node right;
	node(int data){
		this.data = data;
		this.left = null;
		this.right = null;	
	}
}
public class binarysearch {
private static node root = null;
public static void main(String[] args) {
	root = insert(root,10);
	root = insert(root,8);
	root = insert(root,7);
	root = insert(root,9);
	root = insert(root,12);
	root = insert(root,11);
	root = insert(root,14);

/*preorder(root);
	System.out.println();
	inorder(root);
	System.out.println();
	postorder(root);
	node temp = root;
	temp = findmin(temp);
	System.out.println(temp.data);
	temp = root;
	temp = findmax(temp);
	System.out.println(temp.data);
	levelorder(root);*/
	node t = root;
	node current = LCS(t,7,11);
	System.out.println("LCA is : "+current.data);
	
}
private static node LCS(node t, int c1, int c2) {
	node current = t;
	//System.out.println("current data "+current.data);
	node left = null,right = null;
	if(current == null) {
		return current;
	}
	if(current.data == c1 || current.data == c2) {
		return current;
	}
	if(current.data > c1 || current.data > c2) {
		left = LCS(current.left,c1,c2);
	}
	if(current.data < c1 || current.data <c2) {
		right = LCS(current.right,c1,c2);
		System.out.println(right);
	}
	if (left !=null && right != null) {
		return current;
	}
	if(left != null) {
		return root;
	}
	if(right != null) {
		return root;
	}
	return current;
}
private static void levelorder(node root) {
	Queue<node> queue= new LinkedList<node>();
	if(root == null)return;
	queue.add(root);
	while(!queue.isEmpty()) {
		node current = queue.peek();
		if(current.left!=null)queue.add(current.left);
		if(current.right!=null)queue.add(current.right);
		System.out.print(current.data+" ");
		queue.poll();
	}
   
}
private static node findmax(node root) {
	if(root.right == null)return root;
	else 
		return findmax(root.right);
}
private static node findmin(node root) {
	if(root.left == null)return root;
	else
		return findmin(root.left);
}
private static void postorder(node root) {
	if(root == null)return;
	postorder(root.left);
	postorder(root.right);
	System.out.print(root.data+" ");
}
private static void preorder(node root) {
	if (root == null) {
		return;
	}
	System.out.print(root.data+" ");
	preorder(root.left);
	preorder(root.right);
}
private static void inorder(node root) {
	if(root == null)return;
	inorder(root.left);
	System.out.print(root.data+ " ");
	inorder(root.right);
}
static node insert(node root,int n){
	node temp = new node(n);
	if(root == null) {
		root = temp;
	}
	else if(root.data  > temp.data) {
		root.left = insert(root.left,n);
	}
	else {
		root.right = insert(root.right,n);
	}
	return root;	
}
}
