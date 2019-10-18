package DynamicProgramming;

public class minimumSumPath {
	static int sum[][] = new int[3][3];
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		int i=2,j=2;
		arr[0][0]=1;arr[0][1]=3;arr[0][2]=1;
		arr[1][0]=1;arr[1][1]=5;arr[1][2]=1;
		arr[2][0]=4;arr[2][1]=2;arr[2][2]=1;
		int result = pathSum(arr,i,j);
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				System.out.print(sum[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println("sum is: "+result);
	}
	static int pathSum(int arr[][],int i,int j) {
		int temp1=0,temp2=0;
		if(sum[i][j] != 0) 
		{
			return sum[i][j];
		}
		if(i == 0 && j==0) 
		{
			sum[0][0] = arr[0][0];
	    	System.out.print(arr[i][j]+" ");
			return sum[0][0];
		}
		else if(i == 0 && j < arr.length) 
		{
			sum[i][j] = arr[i][j] + pathSum(arr, i, j-1);
	    	System.out.print("-"+arr[i][j]+" ");
		}
		else if(i < arr.length && j == 0) 
		{
			sum[i][j] = arr[i][j] + pathSum(arr, i-1, j);
	    	System.out.print("-"+arr[i][j]+"-");
		}
		else
		{
			temp1 = pathSum(arr, i-1, j);
		    temp2 = pathSum(arr, i, j-1);
		    if(temp1<=temp2) {
		    	sum[i][j] = arr[i][j]+temp1;
			}
		    else {
				sum[i][j] = arr[i][j]+temp2;
		    }
		    System.out.println();
		}
		return sum[i][j];
		
	}
}
