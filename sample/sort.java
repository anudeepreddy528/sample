package sample;

public class sort {
	public static void main(String[] args) {
		int list[] = new int[] {7,2,1,6,8,5,3,4};
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]);
		}
		System.out.println();
		quicksort(list,0,list.length-1);
		int i=0;
		while(i<list.length) {
			System.out.print(list[i]);
			i++;
		}

	}
	private static void quicksort(int[] arr, int start, int end) {
		int pindex;
		if(start > end) return;
		pindex = partition(arr,start,end);
		quicksort(arr,start,pindex-1);
		quicksort(arr, pindex+1, end);
		
	}
	public static int partition(int[] list, int start, int end) {
		int pivot = end;
		int pindex = start;
		for(int i=start;i<end;i++) {
			if(list[i]<=list[pivot]) {
				swap(list,pindex,i);
				pindex++;
			}
		}
			swap(list,pindex,pivot);
		return pindex;
	}
	private static void swap(int[] list,int i, int j) {
		int temp;
		temp=list[i];
		list[i]=list[j];
		list[j]=temp;
	}

}
