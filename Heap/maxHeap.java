package Heap;

public class maxHeap {
	
	private int Heap[];
	private int maxsize;
	private int size;
	
	public maxHeap(int maxsize) {
		this.maxsize  = maxsize;
		this.Heap     = new int[maxsize];
		this.size     = -1;
	}
	private int parent(int current) 
	{
		return (current-1)/2;
	}
	private int left(int current) {
		return (2*current)+1;
	}
	private int right(int current) {
		return (2*current)+2;
	}	
	private boolean isLeaf(int current) {
		if(current >= size/2 && current <= size) {
			return true;
		}
		return false;
	}
    private void swap(int fpos, int spos) 
    { 
        int tmp; 
        tmp 	   = Heap[fpos]; 
        Heap[fpos] = Heap[spos]; 
        Heap[spos] = tmp; 
    } 
	
	private void insert(int element) {
		Heap[++size]  = element;
		int current   = size; 
		while(Heap[current] > Heap[parent(current)]) {
				swap(current,parent(current));
				current = parent(current);
		}		
	}
	private int extractMax() 
	{
		int popped = Heap[0];
		Heap[0] = Heap[size--];
		int cur_size = size;
		maxheapify(0,cur_size);
		return popped;
	}

	private void maxheapify(int i,int cur_size) 
	{
		if(cur_size == 1) {
			if(Heap[i] < Heap[cur_size]) {
				swap(i,cur_size);
				return;
			}
		}
		if(isLeaf(i))return;
		else if(Heap[left(i)] > Heap[right(i)]) 
			{
				swap(i,left(i));
				maxheapify(left(i),cur_size);
			}
		else 
			{
					swap(i,right(i));
					maxheapify(right(i),cur_size);	
			}
	}
	public static void main(String[] args) {
		maxHeap max = new maxHeap(10);
		int sort[] = new int[5];
		int res = 0;
		max.insert(3);
		max.insert(10);
		max.insert(4);
		max.insert(5);
		max.insert(12);
		max.print(max);
		for(int i = max.size; i >= 1; i--) {
			res = max.extractMax();
			sort[i] = res;
		}
		sort[0] = max.Heap[0];
		for(int s :sort) {
			System.out.print(s+" ");
		}
	}
	private void print(maxHeap max) {
		for(int i=0 ; i<= size ;i++) {
			System.out.print(Heap[i]+" ");
		}	
		System.out.println();
	}
}
