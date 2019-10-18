package DynamicProgramming;

public class MaxProductSubArray {

	public static void main(String[] args) {
		int arr[]= {2,3,-2,4,12,-9,18,20};
		maxproduct(arr);
	}

	private static void maxproduct(int[] arr) {
		int local = arr[0];
		int global = arr[0];
		for(int i=1;i<arr.length;i++) {
			local = max(local*arr[i],arr[i]);
			if(local>global) {
				global = local;
			}
		}
			System.out.println("Global max product "+global);
}

	private static int max(int i, int j) {
		if(i>j)
			return i;
		return j;
	}

}
