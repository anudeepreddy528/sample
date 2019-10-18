package DynamicProgramming;

import java.util.Arrays;

public class maxSum {
	static int[] memo;
	public static void main(String[] args) {
		int sum[] = {2,-1,1,-2,4};
		memo = new int[sum.length];
		Arrays.fill(memo,-1);
		int max;
		max = maxsum(sum);
		System.out.println("Max sum is: "+max);
	}
	private static int maxsum(int[] sum) {
		memo[0] = sum[0];
		for(int i=1;i<sum.length;i++) {
			memo[i] = Math.max(sum[i], sum[i]+memo[i-1]);
		}
		return memo[memo.length-1];
	}

}
