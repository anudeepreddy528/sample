package sample;

public class BSA {

	public static void main(String[] args) {
		int arr[] = new int[] {1,5,7,9,18,25,70,48};
		int num = 7;
		int res = search(arr,0,arr.length-1,num);
		System.out.println("element found at "+res);
	}
	private static int search(int[] arr,int min,int max,int n) {
		int mid = (min+max)/2;
		System.out.println(min+" "+mid+" "+max);
		if(arr[mid] == n)return mid;
		else if(n < arr[mid]) {
		mid = search(arr,min,mid-1,n);	
		}
		else if(n > arr[mid]) {
		mid = search(arr,mid+1,max,n);
		}
		return mid;
	}

}
