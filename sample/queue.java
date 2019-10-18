package sample;

class QNode {
    int data;
    QNode next;
    
	public QNode(int data) {
		super();
		this.data = data;
		this.next = null;
	}
}
class queue{
	
   static QNode front = null;
   static QNode rear = null;
   public static void main(String[] args) {
		enqueue(1);
		enqueue(2);
		enqueue(3);
		enqueue(4);
		enqueue(5);
		dequeue();
		QNode itr = front;
		while(itr!=null) {
			System.out.println(itr.data);
			itr=itr.next;
		}
	}

	private static void enqueue(int num) {
		QNode temp = new QNode(num);
		if(rear == null && front == null) {
			rear = temp;
			front = temp;
			return;
		}
		rear.next = temp;
		rear = temp;	
		return;
	}
	
	private static QNode dequeue() {
		if(front == null) return null;
		QNode temp = front;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		return temp;
	}

}

