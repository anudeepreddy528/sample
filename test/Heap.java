package test;

public class Heap {
	
	private int heap[];
	private int maxsize;
	private int size;
	
	public Heap(int maxsize) {
		super();
		this.heap = new int[maxsize];
		this.maxsize = maxsize;
		this.size = -1;
	}

	private int parent(int current) {
		return (current-1)/2;
	}
	
	private int left(int current) {
		return (2*current)+1;
	}
	
	private int right(int current) {
		return (2*current)+2;
	}
	
	private boolean isleaf(int current) {
		if(current >= size/2 ) {
			return true;
		}
		return false;
	}
	
	private void swap(int fpos,int spos) {
		int temp   = heap[fpos];
		heap[fpos] = heap[spos];
		heap[spos] = temp;
	}
	
	public static void main(String[] args) {
		Heap max = new Heap(10); 
		max.insert(11);
		max.insert(24);
		max.insert(10);
		max.insert(7);
		max.insert(5);
		max.insert(6);
		max.insert(4);
		max.print();
		System.out.println();
		max.delete_max();
		max.print();
	}
	
	private void print() {
		for(int i=0; i <= size; i++) {
			System.out.print(heap[i]+" ");
		}
	}

	private void insert(int data) {
		heap[++size] = data;
		int current = size;
		while(heap[current] > heap[parent(current)]) {
				swap(parent(current),current);
				current = parent(current);
			}
		}

	private int delete_max() {
		int val = heap[0];
		heap[0] = heap[size];
		size = size-1;
		heapify();
		return val;
	}
	
	private void heapify() {
		int current = 0;
		int val;
		while(!isleaf(current)) {
			if(heap[left(current)] >= heap[right(current)] ) {
				val = left(current);
			}
			else {
				val = right(current);
			}
			if(heap[current] < heap[val]) {
				swap(current,val);
				current = val;
			}
		}
	}
}
