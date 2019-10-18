package Arrays;

import java.util.ArrayList;
import java.util.List;

public class pascals {
	public static void main(String[] args) {
		int n=7;
		int arr[][] = new int[n+1][n+1];
		for(int i=1;i<=n;i++) {
			for(int space=0;space<n-i;space++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				if((j >= 1 && j < i-1) && i>1) {
					arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
				}
				else {
					arr[i][j] = 1;
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	} 
}
