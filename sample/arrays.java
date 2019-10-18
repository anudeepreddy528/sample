package sample;

public class arrays {
	public static void main(String[] args) {
		int A[] = new int[] {1,3,5,7,9};
		int B[] = new int[] {11,13,15,20,45,56};
		int concat[] = new int[A.length+B.length];
		int i=0,j=0,k=0;
		while(i < A.length || j < B.length) {
			if(i == (A.length)) {
				while(j < B.length) {
					concat[k]=B[j];
					k++;j++;
				}
			}
			else if(j == (B.length)) {
				while(i < A.length) {
					concat[k]=A[i];
					k++;i++;
				}
			}
			else if(A[i] <= B[j]) {
				concat[k]=A[i];
				k++;i++;
			}
			else if(B[j] < A[i]) {
				concat[k]=B[j];
				k++;j++;
			}
		}	
		for(i=0;i<concat.length;i++) {
			System.out.print(concat[i]+" ");
		}
	}

}
