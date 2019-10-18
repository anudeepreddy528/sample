package sample;

public class merge {
public static void main(String[] args) {
		int arr[] = new int[] {70,50,10,7,18,12,120};
		mergesort(arr);
		for(int i : arr) {
			System.out.print(i+" ");
		}
}

private static void mergesort(int[] arr) {
		int n=arr.length;
		if(n<2)return;
		int mid=n/2;
		int left[]=new int[mid];
		int right[]=new int[n-mid];
		for(int i=0;i<mid;i++) {
			left[i]=arr[i];
		}
		for(int j=mid;j<n;j++) {	
		right[j-mid] = arr[j];
		}
		mergesort(left);
		mergesort(right);
		merge(left,right,arr);
}

private static void merge(int[] left, int[] right, int[] arr) {    
     int l=left.length;
     int r=right.length;
     int i=0,j=0,k=0;
     while(i<l && j<r) {
    	 if(left[i]<right[j]) {
    		 arr[k]=left[i++];
    	 }
    	 else {
    		 arr[k]=right[j++];
    	 }
    	 k++;
     }
     while(i<l) {
		 arr[k++]=left[i++];

     }
     while(j<r) {
		 arr[k++]=right[j++];
     }
}
}
