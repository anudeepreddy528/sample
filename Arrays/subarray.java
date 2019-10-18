package Arrays;

public class subarray {

	public static void main(String[] args) {
		int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		maxsubarray(arr);
	}

	private static void maxsubarray(int[] arr) {
		int globalmax=arr[0],localmax=arr[0];
		for(int i=1;i<arr.length;i++) {
			localmax = max(arr[i],arr[i]+localmax);
			if(localmax>globalmax) {
				globalmax=localmax;
			}
		}
		System.out.println("max sub array is "+globalmax);
	}

	private static int max(int i, int j) {
		if(i>j) {
			return i;
		}
		else 
			return j;
	}

}
