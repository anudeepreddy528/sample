package numbers;

public class sqrt {

	public static void main(String[] args) {
		int n=36;
		int res = squareroot(n);
		System.out.println("sqrt of "+n+" is "+res);
	}

	private static int squareroot(int n) {
		int result=0;
		for(int i=1;i<=n/2;i++) {
			if(i*i == n)
				result =i;
		}
		return result;
	}

}
