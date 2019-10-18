package sorting;

public class quick {

	public static void main(String[] args) {
		int arr[]= {12,17,9,3,19,26,11};
		int start = 0,end = arr.length-1;
		quicksort(arr,start,end);
		for(int itr : arr) {
			System.out.print(itr+" ");
		}
	}

	private static void quicksort(int[] arr,int start,int end) {
		if(start < end) {
		int partition = partitionsort(arr, start, end);
			quicksort(arr,start,partition-1);
			quicksort(arr,partition+1,end);
		}
	}

	private static int partitionsort(int[] arr, int start, int end) {
		int pindex = start;
		int pivot  = end;
		for(int i=start; i < end; i++) {
			if(arr[i] < arr[pivot]) {
				swap(arr,pindex,i);
				pindex = pindex+1;
			}
		}
		swap(arr,pindex,pivot);
		return pindex;
	}

	private static void swap(int arr[],int i, int j) {
		int temp;
		temp   = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;	
	}
}
