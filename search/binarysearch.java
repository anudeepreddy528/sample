package search;

import java.util.Scanner;

public class binarysearch {

	public static void main(String[] args) {
		int arr[] = {12,18,25,60,125,190};
		int element;
		Scanner sc = new Scanner(System.in);
		element = sc.nextInt();
		sc.close();
		int pos = search(arr,0,arr.length,element);
		if(pos == -1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("element is found at position: "+pos+" value is: "+arr[pos]);
		}
	}
	private static int search(int[] arr,int start,int end,int element) {
		int mid,position = -1;
		mid = (start+end)/2;
		if(start < end) {
			if(arr[mid] == element) {
				position = mid;
			}
			else if(arr[mid] > element)
			{
				position = search(arr,start,mid-1,element);
			}
			else
			{
				position = search(arr,mid+1,end,element);
			}
		}
		return position;	
	}

}
