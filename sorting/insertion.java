package sorting;

import java.util.Scanner;

public class insertion {
static void insertionsort(int[] arr, int n) {
	int temp;
	for(int i=1;i<n;i++) {
		for(int j=0;j<i;j++) {
			temp = arr[i];
			if(arr[i]<arr[j]) {
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	for(int k : arr) {
		System.out.print(k+" ");
	}
			
}
public static void main(String[] args) {
	int n;
	Scanner sc= new Scanner(System.in);
	n = sc.nextInt();
	int arr[] = new int[n];
    for(int i=0;i<n;i++) {
    	arr[i] = sc.nextInt();
    }
    sc.close();
    insertionsort(arr,n);
}

}
