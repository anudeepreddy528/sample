package Arrays;

import java.util.Scanner;

public class sum2 {

	public static void main(String[] args) {
		int arr[] = {2,5,7,9,12};
		int num;
		Scanner sc= new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		int res[] = sumof(arr,num);
		for(int out : res) {
			System.out.print(out+" ");
		}
	}

	private static int[] sumof(int[] arr, int num) {
		int temp[] = new int[2];
		/*for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==num) {
					temp[0]=arr[i];
					temp[1]=arr[j];
					return temp;
				}
			}
		}*/
		int i=0,j=arr.length-1;
		while(i<j) {
			if(arr[i]+arr[j] == num) {
				//System.out.println(arr[i]+" "+arr[j]);
				temp[0]=arr[i];
				temp[1]=arr[j];
				return temp;
			}
			if(arr[i]+arr[j] < num) {
				i++;
			}
			if(arr[i]+arr[j] > num) {
				j--;
			}
		}
		temp[0] = -1;
		return temp;
	}

}
