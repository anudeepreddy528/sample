package sample;

public class bst {
	int data;
	bst left;
	bst right;

	public bst(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}

	public static void main(String[] args) {
		bst root=null;
		root = insert(root,5);
		root = insert(root,6);
		root = insert(root,2);	
	}

	public static bst insert(bst root,int n) {
		bst temp = new bst(n);
	    if(root == null) {
	    	root = temp;
	    }
	    else if(temp.data<=root.data) {
	    	root.left = insert(root.left,n);
	    }
	    else if(temp.data>root.data) {
	    	root.right = insert(root.right,n);
	    }
	    return root;
	}

}
