package Arrays;
import java.util.Scanner;
import org.apache.commons.lang3.ArrayUtils;

public class Remove {

	public static void main(String[] args) {
		int arr[] = new int[] {10,20,30,40,50,8,20,9,23};
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		remove(arr,num);
		}

	private static void remove(int[] arr, int num) {
		arr = ArrayUtils.removeAllOccurences(arr,num);	
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

}
