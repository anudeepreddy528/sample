package DynamicProgramming;

public class steps {
	static int n=8;
	static int a[] = new int[n+1];
	public static void main(String[] args) {
		int count = ways(n);
		System.out.println("Number of ways:"+count);
	}

	private static int ways(int n) {
		if(a[n] != 0) {
			return a[n];
		}
		if(n == 1 || n == 0 ) {
			a[n] = 1;
		return 1;
		}
		else
			a[n] = ways(n-2)+ways(n-1);
		return a[n];
	}
}
