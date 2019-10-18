package priorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class queue{
	int priority;
	public queue(int priority) {
		this.priority = priority;
	}
public static void main(String[] args) {
	PriorityQueue<queue> priorityqueue = new PriorityQueue<queue>();
	priorityqueue.add(new queue(5));
	priorityqueue.add(new queue(4));
	priorityqueue.add(new queue(3));
	priorityqueue.add(new queue(2));
	priorityqueue.add(new queue(1));
	
	Iterator<queue> itr = priorityqueue.iterator();
	while(itr.hasNext()) {
		System.out.print(itr.next().priority+" ");
	}
}
}

