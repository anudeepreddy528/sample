package sample;

public class dNode {
    static dNode head = null;
	int data;
	dNode prev;
	dNode next;
		
public dNode(int data) {
	this.data = data;
	this.prev = null;
	this.next = null;

}
	public static void main(String[] args) {
		insert(1);
		insert(2);
		insert(3);
		print(head);
		
	}
	private static void print(dNode head) {
		dNode itr=head;
		while(itr != null) {
			System.out.print(itr.data);
			itr=itr.next;
		}
		
	}
	private static void insert(int n) {
		dNode temp = new dNode(n);
 		if(head == null) {
			head = temp;
			return;
		}
		dNode itr=head;
		while(itr.next != null) {
			itr=itr.next;
		}
		itr.next  = temp;
		temp.prev = itr;
		
	}

}
