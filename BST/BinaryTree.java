package BST;

public class BinaryTree {
	int data;
	BinaryTree left;
	BinaryTree right;
	public BinaryTree(int data) {
		this.data  = data;
		this.left  = null;
		this.right = null;
	}
	public BinaryTree() {
	}
	public static void main(String[] args) {
			BinaryTree root = new BinaryTree();
			root = null;
			root = insert(root,8);
		    root = insert(root,6);
		    root = insert(root,10);
		    root = insert(root,5);
		    root = insert(root,7);
		    root = insert(root,9);
		    root = insert(root,12);
		    inorder(root);
		    System.out.println();
		    BinaryTree temp = root;
		    int depth = Maxdepth(temp);
		    System.out.println("Depth is: "+depth);
		    temp = root;
		    boolean sum = pathsum(temp,21);
		    System.out.println("Sum in Path is: "+sum);
	}
	private static boolean pathsum(BinaryTree temp,int sum) {
		if(sum == 0)return true;
		if(temp == null)return false;
		boolean lt,rt;
		lt = pathsum(temp.left,(sum-temp.data));
		rt = pathsum(temp.right,(sum-temp.data));
		if(lt || rt)return true;
		return false;
	}
	private static int Maxdepth(BinaryTree temp) {
		int left,right;
		if(temp == null)return 0;
		left  = 1 + Maxdepth(temp.left);
		right = 1 + Maxdepth(temp.right);
		return Math.max(left, right);
	}
	private static void inorder(BinaryTree root) {
		if(root == null)return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	private static BinaryTree insert(BinaryTree root,int data) {
		BinaryTree node = new BinaryTree(data);
		if(root == null) {
			root = node;
		}
		else if(root.data >=  data ) {
			root.left = insert(root.left,data);
		}
		else {
			root.right = insert(root.right,data);
		}
		return root;
	}
}
