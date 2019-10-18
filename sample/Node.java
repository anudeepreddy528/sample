package sample;
public class Node {
	int data;
	Node next;
	static Node head=null;
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	public static void insert(int i) {
		Node temp = new Node(i);
		if(head == null) {
			head = temp;
			return;
		}
		Node last = head;
		
		while(last.next != null) {
			last=last.next;
		}
		
		last.next=temp;
		return;
	}
	public static void printlist() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data);
			temp=temp.next;
		}
		System.out.println();
	}
	public static void reverse() {
		Node prev=null;
		Node current=head;
		Node next=null;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		Node itr=head;
		while(itr!=null) {
			itr=itr.next;
		}
		
	}
	public static void main(String[] args) {
		insert(1);
		insert(2);
		insert(3);
		//insert(4);
		//insert(5);
		//reverserecurssion(head);
		//printlist();
		middleelement();
	}
	private static void middleelement() {
		Node slow,fast;
		slow=head;
		fast=head;
		while(fast.next!=null&&fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		System.out.println(slow.data);
	}
	private static void reverserecurssion(Node head) {
		Node p=head;
		if(p.next == null) {
			head=p;
			return;
		}
		reverserecurssion(p.next);
		Node q=p.next;
		q.next=p;
		p.next=null;
		//System.out.println(p.data);
		//System.out.println(q.data);
	}
	private static void reverseprint(Node head) {
		Node temp=head;
		if(temp==null) return;
		reverseprint(temp.next);
		System.out.print(temp.data);
		// TODO Auto-generated method stub
		
	}

}
